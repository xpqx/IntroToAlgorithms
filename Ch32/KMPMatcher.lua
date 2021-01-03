-- lua implementation of the Knuth-Morries-Pratt String
-- Matching Algorithm

--INPUT: an array of chars

function computePref(Pat)
  local plen=#Pat
  local pref={}
  local index = 0
  pref[1]=0
  for q=2,plen do
    while index > 0 and Pat[index + 1] ~= Pat[q] do
      index = pref[index]
    end
    if Pat[index + 1] == Pat[q] then
      index = index + 1
    end
    pref[q]=index

  end
  return pref
end

local P={'a','b','a','b','a','b','a','c'}
local result=computePref(P)
for i,v in ipairs(result) do
  io.write(v)
end
print("")