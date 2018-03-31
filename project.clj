(defproject portkey "0.1.0-SNAPSHOT"
  :description ""
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.ow2.asm/asm "5.2"]
                 [org.ow2.asm/asm-analysis "5.2"]
                 [org.clojure/clojure "1.9.0"]
                 [com.esotericsoftware/kryo "4.0.0"]
                 [com.twitter/carbonite "1.4.0"
                 :exclusions [com.esotericsoftware.kryo/kryo]]
                 [com.github.portkey-cloud/aws-clj-sdk "aeb414319a"]
                 [com.amazonaws/aws-java-sdk "1.11.166"]
                 [com.amazonaws/aws-lambda-java-core "1.1.0"]
                 [com.cemerick/pomegranate "0.3.1"]
                 [org.apache.httpcomponents/httpcore "4.4.6"]
                 [cheshire "5.7.1"]]
  :java-source-paths ["src/main/java"]
  :source-paths ["src/main/clojure"]
  :repositories [["jitpack" "https://jitpack.io"]]
  :profiles {:dev {:dependencies [[com.opentable.components/otj-pg-embedded "0.7.1"]
                                  [org.clojure/java.jdbc "0.7.0"]]}})
