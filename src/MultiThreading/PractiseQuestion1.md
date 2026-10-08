# --Task1 --
1. Thread 1 --> Item =0 
     +5 -->Item=5 
     +5 -->Item=10
     +5 -->Item=15 
     +5--->Item=20 

2. Thread 1 , Thread 2 
    Thread 1 --> 5 Item add into Stock 
    Thread 2 --> 10 Item consume from Stock 

    Thread 1--->5 item added to stock 
3.  Thread 1--->5 item added to stock
    Thread 2--->Consume (10)

    Thread 1--->5 item added to stock
3.  Thread 1--->5 item added to stock
    Thread 2--->Consume (10)

    Thread 1--->5 item added to stock
3.  Thread 1--->5 item added to stock
    Thread 2--->Consume (10)


    Thread 1--->10 Item added to Stock
    Thread 2-->consume (5) 
    Thread 2-->consume (5) 

   Thread 1--->10 Item added to Stock
   Thread 2-->consume (5)
   Thread 2-->consume (5) 
Total item -->30 item 
        Thread2-->consume-->30 item
