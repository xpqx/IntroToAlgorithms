dbg=require("debugger")

function arrayInit(Arr)
  for i in ipairs(Arr) do
    Arr[i]=0
  end
  return Arr
end


function merge(Arr,low,mid,hi)
  local Leftlim = mid - low + 1
  local Rightlim = hi - mid
  local Left={}
  Left=arrayInit(Left)
  local Right = {}
  Right=arrayInit(Right)
  for i = 1,Leftlim do
    Left[i]=Arr[low + i -1]
  end
  for j=1,Rightlim do
    Right[j]=Arr[mid + j]
  end
  Left[Leftlim] = math.huge
  Right[Rightlim] = math.huge
  lefti=1
  righti=1
  for k=low,hi do
    if Left[lefti] <= Right[righti] then
      Arr[k] = Left[i]
      lefti=lefti+1
    else
      Arr[k] = Right[righti]
      righti=righti+1
    end
  end
end

function mergeSort(Arr,low,hi)
  dbg()
  if low < hi then
    mid = math.floor((low + hi)*0.5)
    mergeSort(Arr,low,mid)
    mergeSort(Arr,mid+1,hi)
    merge(Arr,low,mid,hi)
  end
end

function printArray(Arr)
  for i,v in ipairs(Arr) do
    io.write(v," ")
  end
  io.write("\n")
end
function main()
  a={7,3,8,10,21,2,1,4}
  printArray(a)
  mergeSort(a,1,#a)
  printArray(a)
end
main()