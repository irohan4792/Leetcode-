class Solution {
    public int findCircleNum(int[][] isConnected) {
	var count = 0;
	var visited = new HashSet<Integer>();

	for (var node = 0; node < isConnected.length; node++)
		if (dfs(isConnected, node, visited))
			count++;

	return count;
}
public boolean dfs(int[][] isConnected, int node, Set<Integer> visited) {
	if (!visited.add(node))
		return false;

	for (var column = 0; column < isConnected[node].length; column++)
		if (isConnected[node][column] == 1)
			dfs(isConnected, column, visited);

	return true;
}
}