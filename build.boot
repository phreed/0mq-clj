(set-env!
    :resource-paths #{"src/main/clj"}
    :source-paths #{"src/main/clj"}
    :dependencies
      '[[me.raynes/conch "0.8.0"]
        [org.clojure/clojure "1.8.0"]
        [org.zeromq/jeromq "0.3.5"]
        [org.zeromq/cljzmq "0.1.4"
               :exclusions [org.zeromq/jzmq]]]
    :jvm-opts ["-Djava.library.path=/usr/lib:/usr/local/lib"])

(task-options!
    pom {:project 'zmp-clj
         :version "0.1.0"}
    jar {:manifest {"Foo" "bar"}})

(require 'hwserver)
(deftask run-server []
  (with-pass-thru _
    (hwserver/-main)))

(require 'hwclient)
(deftask run-client []
  (with-pass-thru _
    (hwclient/-main)))
