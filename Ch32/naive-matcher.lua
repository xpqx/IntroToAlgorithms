dbg=require "debugger"
-- The Naive String Matching Algorithm
-- as presented in the book.
-- INPUT: Target text to be searched; Pattern saught
function naive_string_matcher(Target, Pattern)
  dbg()
  local tlen = #Target -- lua's builtin string length function
  local plen = #Pattern
  local tpdiff = tlen - plen
  for idx=1,tpdiff do
    --if current chars are equal then
    if Pattern:sub(idx,idx)==Target:sub(idx,idx) then
    --check if the rest of the pattern matches
       for shift=1,plen do
         --if you find chars do match continue the innerloop
          if Pattern:sub(idx+shift,idx+shift) == Target:sub(idx+shift,idx+shift) then
	    continue
	  else
	     break
	  end
       end --innerfor
       --if it makes out of the innerfor then
         print("match occurs at ", idx)
     end
   end
end

T="acaabc"
P="aab"
--OUTPUT SHOULD BE idx=3
naive_string_matcher(T,P)