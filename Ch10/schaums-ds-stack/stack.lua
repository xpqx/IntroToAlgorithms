-- Stack Implementation in Lua

--Lua's only data structure is the 'table'; thus 
--we need to massage into a stack; it is very simple.

Stack={
  top=1 -- pointer var to top of stack
  seq={} --
} --declare Stack Class Object

--Stack.new takes an optional list and pushes its contents
--onto the stack
function Stack.new()
  seq={}
  s={Stack.top,seq}
  setmetatable(s,self)
  self.__index=self
  return s
end

--for managing the size of the stack, we can
-- use the '#' operator which calculates the lengths
-- tables in lua
function Stack.size()
  return #self.seq
end

function Stack.isEmpty()
  return Stack.size() == 0
end

--lua has a 'table.remove' function which can emulate a stack.pop
--which takes 2 args a table and position
function Stack.pop()
  return function()
         return table.remove(self.seq,self.top)
	 end
end

--lua has 'table.insert' which takes 2 args: lis and value and
-- an optional position in this order: list, pos, val;
function Stack.push(e)
     table.insert(self.seq,self.top, e)
     return true
end
function Stack