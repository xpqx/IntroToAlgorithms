dbg=require("debugger")
--Extended Form of Euclid's Algorithm
--params: two integers a,b
--output: 3 integers that satisfy gcd(a,b)=a*x + b*y 


function extGCD(a,b)
   local s=0;local old_s=1
   local t=1;local old_t=0
   local r=b;local old_r=a
   local q=0
   local fl=math.floor
   while r ~= 0 do
      q= fl(old_r/r)
      old_r, r = r, old_r - q*r
      old_s, s = s, old_s - q*s
      old_t, t = t, old_t - q*t

   end
   return old_r,old_s,old_t
end


function modularLinearEquationSolver(a,b,n)
  dbg()
  local d,x,y=extGCD(a,n)
  print("d = ",d,"x = ",x,"y = ",y)
  local x0=0
  if b % d == 0 then
    x0=((x*(b/d)) % n)
    for i=0,d-1 do
      print((x0 + i*(n/d))%n)
    end
  else return -1
  end
end

modularLinearEquationSolver(14,30,100)
