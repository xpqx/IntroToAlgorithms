
-- in Lua, the table structure is easy to nest
-- so we can replicate {{state,char},newState}
function computeTransitionFunction(P,Alpha)
  local m=#P
  local pref=""
  local delta={} --init empty transition table
  for q=1,m do
    for c=1,#Alpha do
       delta[q][c] = return function(q) return q+1 end 



function FAMatcher(T,delta,m)
  local n=#T
  local state=0
  for i=1,n do
    state=delta[state][T:sub(i,i)]
    if state == m then
      return i - m
    end
  end
end




functiom main()
  local T="ababaacaba"
  local P={'b','a','a'}
  local Alpha={'a','b','c'}
  local delta=computeTransitionFunction(P,Alpha)
  local m=#P
  local result=FAMatcher(T,delta,m)
  print("the result is ",result)
end
main()