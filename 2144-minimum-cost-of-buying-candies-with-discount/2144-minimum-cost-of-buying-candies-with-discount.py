class Solution:
    def minimumCost(self, cost: List[int]) -> int:
        cost = sorted(cost, reverse =True)
        sum = 0 
        for i in range(len(cost)):
            if (i+1)%3 != 0 :
                sum += cost[i]
          

        return sum
        