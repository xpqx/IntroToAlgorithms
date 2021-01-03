function gcd(x,y)
   if y==0 then return x
   else return gcd(y,x%y)
   end
end

function extendedGCD(a,b)
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
 --     print(q,r,s,t)
   end
   return old_s,old_t,old_r
end
