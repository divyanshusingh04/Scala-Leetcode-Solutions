/**
 * Definition for a Node.
 * class Node(var _value: Int) {
 *   var value: Int = _value
 *   var neighbors: List[Node] = List()
 * }
 */

object Solution {
    def cloneGraph(graph: Node): Node = {
        if(graph == null) return null;
        var visited = scala.collection.mutable.HashMap[Node, Boolean]().withDefaultValue(false);
        var mapping = scala.collection.mutable.HashMap[Node, Node]().withDefaultValue(null);
        var newRoot = new Node(graph.value);

        var q = scala.collection.mutable.Queue[Node]();
        
        mapping(graph) = newRoot;
        q.enqueue(graph);
        visited(graph) = true;

        while(!q.isEmpty) {
            var originalNode = q.dequeue;


            var duplicateNode = mapping(originalNode);

            for(neighbor <- originalNode.neighbors) {
                if(!mapping.contains(neighbor)) {
                    var duplicateNeighbor = new Node(neighbor.value)
                    mapping(neighbor) = duplicateNeighbor;
                    duplicateNode.neighbors :+= duplicateNeighbor;

                } else {
                    duplicateNode.neighbors :+= mapping(neighbor);
                }
                if(!visited(neighbor)) {
                    visited(neighbor) = true;
                    q.enqueue(neighbor);
                }
            }            
        }
        return newRoot;
    }
}
