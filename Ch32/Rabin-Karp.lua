--Rabin-Karp-Matcher
-- based on number-theoretic principles

function Rabin_Karp_Matcher(Target,Pattern,prime)
  local Tlen=#Target
  local Plen=#Pattern
  local highbitpos=10^(Plen-1)%prime
  local Pmod=0
  local Tmod=0

  for i=1,Plen do
    Pmod = (10*Pmod+Pattern:sub(i,i))%prime
    Tmod =(10*Tmod +Target:sub(i,i))%prime
  end

  for shift=0,Tlen-Plen do
    if Pmod == Tmod then
      for i=0,Plen do
        if Pattern:sub(i,i)==Target:sub(i+shift,i+shift) then
	  return shift
	else
	  break
	end
      end

    if shift < Tlen-Plen then
      Tmod = (10*(Tmod-Target:sub(shift+1,shift+1)*highbitpos) +
             Target:sub(shift+i+Plen+1,shift+i+Plen+1))%prime