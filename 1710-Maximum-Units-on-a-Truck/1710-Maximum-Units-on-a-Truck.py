class Solution:
    def maximumUnits(self, boxTypes: List[List[int]], truckSize: int) -> int:
        units = 0 
        def getMax():
            m = 0
            for i in range(1,len(boxTypes)):
                if(boxTypes[i][1] > boxTypes[m][1]):
                    m = i
            return m
        while truckSize > 0 and len(boxTypes) != 0 :
            m = getMax()
            if boxTypes[m][0] <= truckSize:
                units += boxTypes[m][0] * boxTypes[m][1]
                truckSize -= boxTypes[m][0]
                boxTypes.pop(m)
            else:
                units += truckSize * boxTypes[m][1]
                truckSize = 0 
        return units