dbg=require("debugger")
function modExp(b, e, m)
   function sq(y) return y*y end
   if e == 0 then return 1
   elseif e%2==0 then
      return sq(modExp(b,e/2,m))%m
   else
      return b*(modExp(b,e-1,m))%m
   end
end


--returns true if a is nontrivial square root of n
function isNontrivSqrt(a,n)
  if a*a % n ~= 1 then -- if a^2 /= 1 mod n 
    return false
  elseif a == 1 or a == -1 then
    return false
  else
    return true
  end
end

--preWitness performs a precomputation on the input
--INPUT: n
--OUTPUT: r,d such that n-1 =r* 2^d 
function preWitness(n)
   local m=n-1
   local d=m/2
   local r=1
   while d % 2 == 0 do
      r=r+1 --inc r
      d= d/2 --divide again
   end
   return r,d	
end
res1,res2=preWitness(33)
print("33 - 1 = ",res2,"*","2^",res1)
function Witness(a,n)
  dbg()
   local ntsqrt=isNontrivSqrt
   local d,r=preWitness(n)
   local x0 = modExp(a,r,n)
   local i=0
   while i ~= d do
      i=i+1
      if ntsqrt(x0,n) then--is x0 a nontrivial sqrt 1 modn
         return true  --if so return true or composite
      end
      x0 = (x0*x0)%n
   end
   if x0 ~= 1 then return true end
   return false
end
print("is 41 a composite witness for 101?",Witness(41,101))

--[[
   the input to the millerRabin test has to be in the form 2^r*d+1; ie,
   take n, subtract 1; then divide out 2 until the number is odd; d is the odd number.
   give these r and d to the witness()

   witness(a,n) is an auxiliary proc which returns true if
   a is a witness to the compositeness of n
--]]
function MRTest(n,times)     
     local setseed=math.randomseed
     local random=math.random
     local witness=Witness
     local j=0
     while j<times do
        j=j+1
        local a=random(2,n-2)
        if witness(a,n) then
	return false
	end
     end
   return true 
end --MillerRabinTest
print("is 101 prime?", MRTest(101,5))
print("is 561 prime?",MRTest(561,5))
--print("is 431 prime?",MRTest(431,5))
