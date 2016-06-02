# 0mq-clj
Something to learn 0mq and clojure

There is no need to install jzmq as this uses the pure java jeromq.
https://github.com/zeromq/jeromq
JeroMQ does not use exactly the same API but it should be good enough.
You just need to install 'boot-clj' and then start the client and server.

http://boot-clj.com/

There are two tasks in the 'build.boot' file that can be used to start things.

```bash
boot run-client
boot run-server
```

The order you start them should not matter. 
That is one of the nice things about 0mq.

These two tasks correspond to the programs found...
http://zguide.zeromq.org/page:all#Ask-and-Ye-Shall-Receive


