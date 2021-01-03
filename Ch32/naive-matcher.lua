dbg=require "debugger"
-- The Naive String Matching Algorithm
-- as presented in the book.
-- INPUT: Target text to be searched; Pattern saught
function naive_string_matcher(Target, Pattern)
--  dbg()
  local tlen = #Target -- lua's builtin string length function
  local plen = #Pattern
  local tpdiff = tlen - plen
  for idx=1,tlen do
    local pchar=Pattern:sub(1,1)
    local tchar=Target:sub(idx,idx)
    --if current chars are equal then
    if pchar==tchar then
    --check if the rest of the pattern matches
       for shift=1,plen do
          --if we find a char that is not equal
          if Pattern:sub(shift,shift) ~= Target:sub(idx+shift-1,idx+shift-1) then
           --break out of the loop
             break
	  end
	  ---otherwise return the index
	  return idx
       end --innerfor
     end--outerif
   end--outerfor
   --if something goes wrong return -1
   return -1
end

T="bcaabc"
P="aab"
--OUTPUT SHOULD BE idx=3
print(naive_string_matcher(T,P))