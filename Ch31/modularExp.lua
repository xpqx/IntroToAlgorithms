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

function NthPowerTable(mod,N)
   print("Nth Power Table mod ",mod,"\n")
   for i=1,mod do
      io.write(i,"^",N,": ", i^N," mod ",mod,": ",modExp(i,N,mod),"\n")
   end
end
NthPowerTable(3,19)


local res=isNontrivSqrt(6,35)
print("is 6 a nontrivial square root of 35:",res)
local res=isNontrivSqrt(-1,35)
print("is -1 a nontrivial square root of 35:",res)

