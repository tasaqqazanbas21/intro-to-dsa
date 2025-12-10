# Linked List

Linked list is a linear data structure that uses **nodes** as its the most fundamental building block. In singly linked node, each node contains a data and a pointer to the next node. There are two special structures in Linked List: head, a pointer that points to the first node in the linked list and tail node which is the last node of the linked list. 

Linked List ADT:
    - data: linked list elements
    - operations: insert(), delete(), isEmpty(), search(), get(), size()
      Important: insert() is just a general name for process of inserting a value into the linked list.
      In most cases, there are three types of insert in a linked list implementation: insert at head, insert at certain index and insert at tail. The same goes for delete(), it is just a general naming for deleting procedure, it often also has three implementations such as delete at head, delete at certain index and delete at tail.
      It is also worth to note that depending on the fields you have in your Linked List, certain methods have different complexities. Exempli gratia, if we separate variable that points to the tail node, insert at tail would have complexity of O(1), if we don't then we would have to traverse through whole linked list to delete the tail (since one node of linked list can only be accessed from previous node except for head node) and the complexity would become O(n). On the contrary, delete at tail will always have complexity of O(n) since we need to access the node before the tail to delete the tail which is possible via either keeping separate pre-tail node or traversal. Obviously, having another variable that points to pre-tail node would interfere the logic of our program and make everything even more sophisticated. Hence, deletion at tail via traversal is the most simple approach and it will be used in this implementation. For insert at head, we usually have the same complexity of O(1) since it is a convention to have pointed to the head node. Similarly, insert/delete at certain index will always have O(n) no matter of the implementation since we never know the index beforehand. size() method also can have different complexities depending on how it was implemented, id est some people do not keep separate variable size that either increments or decrements after insertion or deletion, but instead traverse through whole linked list to count all the nodes each time size() is called.
      search() and get() are pretty similar differing only in returned values. They both have complexity of O(n) since each of them requires traversal through the linked list.
    - error conditions: deleting, searching, getting from an empty linked list

In my implementation of Linked List, I will try to get the best possible complexities for each of the methods and not add any internal methods into the nodes (making the nodes non-functional). In my opinion, keeping the nodes non-functional could standardize the nodes in general so the idea of it won't change while switching from one dynamic data structure to another one. I have seen in my universities' lab works how they have the same nodes in several dynamic data structure but all of them differ in the methods they contain, up to this I do not understand the point of it since it just makes understanding of each dynamic data structure even harder and makes them obnoxious. I will always prefer simplicity and efficiency over unjustified cumbersomeness. Ultimately, all the main functionality will be contained only withing Linked List class without additional support from other classes.

![Linked List](Linkedlist.webp 'Linked List')

I have not used any reference to support any of my claims here, so you will have to just trust me. Nonetheless, you can find some additional resources below.

Additional materials:
    1. https://www.geeksforgeeks.org/dsa/linked-list-data-structure/

