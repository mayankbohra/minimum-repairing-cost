<h1 align="center">Minimum Repairing cost</h1>

<hr>

<h2>Problem Statement</h2>
<p">
The city's roads have been destroyed due to some natural calamities, and the government needs to repair them. There are n major localities in the city, and each road connecting them, has a different repairing cost. The repairing cost of each road is given as input by the user, and the government wants to repair the roads in such a way that the total cost is minimized.
Write java code to find the minimum repairing cost and localities in which the road is to be repaired. 
</p>

<hr>

<h2>Algorithm</h2>
<p>
Algorithm for Java Program to Find Minimum Repairing Cost and Localities for a City's Roads:
<ol>
  <li>Start the program.</li>
  <li>Take the input for the number of localities in the city from the user.</li>
  <li>Create an adjacency matrix to represent the graph with n x n size.</li>
  <li>Prompt the user for the cost of repairing each road between the localities and store it in the graph.</li>
  <li>Print the adjacency matrix for the graph.</li>
  <li>Create an array to store the parent of each vertex in the MST.</li>
  <li>Call the mincost() function to find the minimum repairing cost of the roads and the localities in which the road is to be repaired.</li>
  <li>
  Inside the mincost() function,
    <ul>
      <li>Create a priority queue to store the edges of the graph.</li>
      <li>Create an array to store the minimum weight of edges that connect each vertex to the MST.</li>
      <li>Initialize the arrays.</li>
      <li>Add the first vertex to the MST and set its key to 0.</li>
      <li>Loop until all vertices are added to the MST.</li>
      <li>Get the vertex with the smallest key that is not in the MST.</li>
      <li>Get the vertex with the smallest key that is not in the MST.</li>
      <li>Check if the adjacent vertices to the vertex u is not in the MST and update their key and parent.</li>
      <li>Calculate the sum of weights of the edges in the MST.</li>
      <li>Return the sum of weights of the edges in the MST.</li>
    </ul>
  </li>
  <li>Print the minimum repairing cost of the roads and the localities in which the road is to be repaired.</li>
  <li>Stop the program.</li>
</ol>
</p>

<hr>

<h2>Connect With Me: </h2>
<p align="left">
<a href="https://linkedin.com/in/https://www.linkedin.com/in/mayank-bohra/" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/linked-in-alt.svg" alt="https://www.linkedin.com/in/mayank-bohra/" height="30" width="40" /></a><a href="https://instagram.com/https://www.instagram.com/mayank.bohra_06/" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/instagram.svg" alt="https://www.instagram.com/mayank.bohra_06/" height="30" width="40" /></a>
</p>
