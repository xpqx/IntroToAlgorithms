--dbg= require "debugger"

function comp(x,y)
   if x == nil or y == nil then return false end
   
  if x<y then  return -1
  else if x == y then  return 0
       else return 1
       end
  end
end

function insertionSort(a,comp)
--   dbg() -- call debugger
    local i=2 -- start at 2nd entry of a
    local j=i
    local key=0
    while i <= #a do
        j=i
	key = a[i]
	while j > 1 and comp(key, a[j-1]) < 0 do
	    a[j] = a[j-1]  --moves value down
	    j=j-1
        end
        a[j]=key
        i=i+1
    end
end
 
function printArray(Arr)
    for i=1,#Arr do
	io.write(Arr[i]," ")
    end 
    io.write("\n")
end
function main ()
    local a = {4, 65, 2, -31, 0, 99, 2, 83, 782, 1}
    printArray(a)
    insertionSort(a, comp)
    printArray(a)

end

main()
