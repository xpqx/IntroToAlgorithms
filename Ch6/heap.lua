local dbg=require "debugger"
-- a heap structure which is an array of nodes
heap={
   list={},
   size=0
}

function heap:new(list)
   self.list=list
   self.size=0
   local h={list,size}
   setmetatable(h,self)
   self.__index=self
   return h 
end

function heap:parent(i)
   return math.floor(i/2)
end

function heap:left(i)
   return 2*i
end

function heap:right(i)
   return 2*i+1
end


function heap:Maxheapify(i)
  -- dbg()
   local l=self:left(i)
   local r=self:right(i)
   local largest=0
   if l <= self.size and self.list[l] > self.list[i] then
      largest=l
   else largest=i
   end
   if r <= self.size and self.list[r]>self.list[largest] then
      largest = r
   end
   if largest ~= i then
      self:swap(i,largest)
      self:Maxheapify(largest)
   end
end

function heap:minheapify(i)
  -- dbg()
   local l=self:left(i)
   local r=self:right(i)
   local largest=0
   if l <= self.size and self.list[l] > self.list[i] then
      largest=l
   else largest=i
   end
   if r <= self.size and self.list[r]>self.list[largest] then
      largest = r
   end
   if largest ~= i then
      self:swap(i,largest)
      self:minheapify(largest)
   end
end
--auxiliary swap function
function heap:swap(x,y)
   local t=self.list[x];
   self.list[x]=self.list[y];
   self.list[y]=t
end


function heap:buildMaxHeap()
   self.size=#self.list
   local n= math.floor(#self.list/2)
   for i=n,1,-1 do
      self:Maxheapify(i)
   end
end

function heap:toString()
   local size_str="the heap size is "..tostring(self.size).."\n"
   local list_str="the heap contains: ...\n"
   for i in ipairs(self.list) do
      list_str=list_str..tostring(self.list[i]).." "
   end
   list_str=list_str.."\n"
   return size_str..list_str
end

function heap:Sort()
   self:buildMaxHeap()
   for i=self.size,2,-1 do
      self:swap(1,i)
      self.size=self.size-1
      self:Maxheapify(1)
   end
end
function printlist(x)
   for i in ipairs(x) do
      io.write(" ",x[i])
   end
   print("\n")
end
function main()
   local l={5,13,2,25,7,17,20,8,4}
   printlist(l)
   
   local h=heap:new(l)
   print(h:toString())
   h:Sort()
   print(h:toString())
end


main()
