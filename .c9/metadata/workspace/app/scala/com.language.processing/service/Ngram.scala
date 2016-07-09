{"filter":false,"title":"Ngram.scala","tooltip":"/app/scala/com.language.processing/service/Ngram.scala","undoManager":{"mark":100,"position":100,"stack":[[{"start":{"row":7,"column":8},"end":{"row":7,"column":9},"action":"insert","lines":["s"],"id":261}],[{"start":{"row":7,"column":9},"end":{"row":7,"column":10},"action":"insert","lines":["i"],"id":262}],[{"start":{"row":7,"column":10},"end":{"row":7,"column":11},"action":"insert","lines":["g"],"id":263}],[{"start":{"row":7,"column":11},"end":{"row":7,"column":12},"action":"insert","lines":["n"],"id":264}],[{"start":{"row":7,"column":12},"end":{"row":7,"column":13},"action":"insert","lines":["s"],"id":265}],[{"start":{"row":7,"column":13},"end":{"row":7,"column":14},"action":"insert","lines":[" "],"id":266}],[{"start":{"row":7,"column":13},"end":{"row":7,"column":14},"action":"remove","lines":[" "],"id":267}],[{"start":{"row":7,"column":13},"end":{"row":7,"column":14},"action":"insert","lines":["="],"id":268}],[{"start":{"row":7,"column":14},"end":{"row":7,"column":15},"action":"insert","lines":[" "],"id":269}],[{"start":{"row":7,"column":15},"end":{"row":7,"column":16},"action":"insert","lines":[":"],"id":270}],[{"start":{"row":7,"column":16},"end":{"row":7,"column":17},"action":"insert","lines":[" "],"id":271}],[{"start":{"row":7,"column":17},"end":{"row":7,"column":18},"action":"insert","lines":["q"],"id":272}],[{"start":{"row":7,"column":18},"end":{"row":7,"column":19},"action":"insert","lines":["u"],"id":273}],[{"start":{"row":7,"column":19},"end":{"row":7,"column":20},"action":"insert","lines":["r"],"id":274}],[{"start":{"row":7,"column":20},"end":{"row":7,"column":21},"action":"insert","lines":["a"],"id":275}],[{"start":{"row":7,"column":21},"end":{"row":7,"column":22},"action":"insert","lines":["n"],"id":276}],[{"start":{"row":7,"column":22},"end":{"row":7,"column":23},"action":"insert","lines":[" "],"id":277}],[{"start":{"row":7,"column":23},"end":{"row":7,"column":24},"action":"insert","lines":["s"],"id":278}],[{"start":{"row":7,"column":24},"end":{"row":7,"column":25},"action":"insert","lines":["i"],"id":279}],[{"start":{"row":7,"column":23},"end":{"row":7,"column":25},"action":"remove","lines":["si"],"id":280},{"start":{"row":7,"column":23},"end":{"row":7,"column":28},"action":"insert","lines":["signs"]}],[{"start":{"row":7,"column":15},"end":{"row":7,"column":16},"action":"remove","lines":[":"],"id":281}],[{"start":{"row":7,"column":14},"end":{"row":7,"column":15},"action":"remove","lines":[" "],"id":282}],[{"start":{"row":7,"column":13},"end":{"row":7,"column":14},"action":"insert","lines":[" "],"id":283}],[{"start":{"row":5,"column":6},"end":{"row":5,"column":7},"action":"remove","lines":["n"],"id":284}],[{"start":{"row":5,"column":6},"end":{"row":5,"column":7},"action":"insert","lines":["N"],"id":285}],[{"start":{"row":22,"column":2},"end":{"row":23,"column":0},"action":"insert","lines":["",""],"id":286},{"start":{"row":23,"column":0},"end":{"row":23,"column":2},"action":"insert","lines":["  "]}],[{"start":{"row":23,"column":2},"end":{"row":24,"column":0},"action":"insert","lines":["",""],"id":287},{"start":{"row":24,"column":0},"end":{"row":24,"column":2},"action":"insert","lines":["  "]}],[{"start":{"row":24,"column":2},"end":{"row":25,"column":0},"action":"insert","lines":["",""],"id":288},{"start":{"row":25,"column":0},"end":{"row":25,"column":2},"action":"insert","lines":["  "]}],[{"start":{"row":25,"column":2},"end":{"row":39,"column":3},"action":"insert","lines":["  def generateUniquePhrases(numOfWords: Int = 1): List[(String, Int)] = {","    ","  val punctuationSet = (\")(,.?;!:\").toSet","  ","  val signs =  new Quran signs","","   (for( i <- 0 to signs.length-1) yield  signs(i)","      .split(\" \")","      .map(x => x.filterNot(punctuationSet.contains(_)))","      ).flatten.toList.groupBy(x => x.toLowerCase)   ","       .toList","       .map{case(ngram, occurrences) => (ngram, occurrences.length)}","       .map{case(ngram, occurrences) => (ngram.capitalize, occurrences)}","       .filter{case(ngram, occurrences) => occurrences < 2 }","  }"],"id":289}],[{"start":{"row":5,"column":24},"end":{"row":5,"column":25},"action":"insert","lines":["W"],"id":309}],[{"start":{"row":5,"column":25},"end":{"row":5,"column":26},"action":"insert","lines":["i"],"id":310}],[{"start":{"row":5,"column":26},"end":{"row":5,"column":27},"action":"insert","lines":["t"],"id":311}],[{"start":{"row":5,"column":27},"end":{"row":5,"column":28},"action":"insert","lines":["h"],"id":312}],[{"start":{"row":5,"column":19},"end":{"row":5,"column":28},"action":"remove","lines":["QuranWith"],"id":313},{"start":{"row":5,"column":19},"end":{"row":5,"column":31},"action":"insert","lines":["QuranWithAya"]}],[{"start":{"row":7,"column":21},"end":{"row":7,"column":22},"action":"remove","lines":[" "],"id":314}],[{"start":{"row":7,"column":21},"end":{"row":7,"column":22},"action":"insert","lines":["."],"id":315}],[{"start":{"row":7,"column":22},"end":{"row":7,"column":23},"action":"insert","lines":[","],"id":316}],[{"start":{"row":7,"column":22},"end":{"row":7,"column":23},"action":"remove","lines":[","],"id":317}],[{"start":{"row":7,"column":27},"end":{"row":7,"column":28},"action":"insert","lines":["."],"id":318}],[{"start":{"row":7,"column":28},"end":{"row":7,"column":29},"action":"insert","lines":["m"],"id":319}],[{"start":{"row":7,"column":29},"end":{"row":7,"column":30},"action":"insert","lines":["a"],"id":320}],[{"start":{"row":7,"column":30},"end":{"row":7,"column":31},"action":"insert","lines":["p"],"id":321}],[{"start":{"row":7,"column":31},"end":{"row":7,"column":33},"action":"insert","lines":["()"],"id":322}],[{"start":{"row":7,"column":32},"end":{"row":7,"column":33},"action":"insert","lines":["x"],"id":323}],[{"start":{"row":7,"column":33},"end":{"row":7,"column":34},"action":"insert","lines":[" "],"id":324}],[{"start":{"row":7,"column":34},"end":{"row":7,"column":35},"action":"insert","lines":["="],"id":325}],[{"start":{"row":7,"column":35},"end":{"row":7,"column":36},"action":"insert","lines":[">"],"id":326}],[{"start":{"row":7,"column":36},"end":{"row":7,"column":37},"action":"insert","lines":[" "],"id":327}],[{"start":{"row":7,"column":36},"end":{"row":7,"column":37},"action":"remove","lines":[" "],"id":328}],[{"start":{"row":7,"column":35},"end":{"row":7,"column":36},"action":"remove","lines":[">"],"id":329}],[{"start":{"row":7,"column":34},"end":{"row":7,"column":35},"action":"remove","lines":["="],"id":330}],[{"start":{"row":7,"column":33},"end":{"row":7,"column":34},"action":"remove","lines":[" "],"id":331}],[{"start":{"row":7,"column":32},"end":{"row":7,"column":33},"action":"remove","lines":["x"],"id":332}],[{"start":{"row":7,"column":32},"end":{"row":7,"column":33},"action":"insert","lines":["_"],"id":333}],[{"start":{"row":7,"column":33},"end":{"row":7,"column":35},"action":"insert","lines":["()"],"id":334}],[{"start":{"row":7,"column":34},"end":{"row":7,"column":35},"action":"insert","lines":["2"],"id":341}],[{"start":{"row":6,"column":4},"end":{"row":7,"column":0},"action":"insert","lines":["",""],"id":342},{"start":{"row":7,"column":0},"end":{"row":7,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":7,"column":4},"end":{"row":8,"column":0},"action":"insert","lines":["",""],"id":343},{"start":{"row":8,"column":0},"end":{"row":8,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":8,"column":4},"end":{"row":8,"column":5},"action":"insert","lines":["v"],"id":344}],[{"start":{"row":8,"column":5},"end":{"row":8,"column":6},"action":"insert","lines":["a"],"id":345}],[{"start":{"row":8,"column":6},"end":{"row":8,"column":7},"action":"insert","lines":["l"],"id":346}],[{"start":{"row":8,"column":7},"end":{"row":8,"column":8},"action":"insert","lines":[" "],"id":347}],[{"start":{"row":8,"column":8},"end":{"row":8,"column":9},"action":"insert","lines":["s"],"id":348}],[{"start":{"row":8,"column":8},"end":{"row":8,"column":9},"action":"remove","lines":["s"],"id":349}],[{"start":{"row":8,"column":8},"end":{"row":8,"column":9},"action":"insert","lines":["v"],"id":350}],[{"start":{"row":8,"column":9},"end":{"row":8,"column":10},"action":"insert","lines":["e"],"id":351}],[{"start":{"row":8,"column":10},"end":{"row":8,"column":11},"action":"insert","lines":["r"],"id":352}],[{"start":{"row":8,"column":11},"end":{"row":8,"column":12},"action":"insert","lines":["s"],"id":353}],[{"start":{"row":8,"column":12},"end":{"row":8,"column":13},"action":"insert","lines":["e"],"id":354}],[{"start":{"row":8,"column":13},"end":{"row":8,"column":14},"action":"insert","lines":["s"],"id":355}],[{"start":{"row":8,"column":14},"end":{"row":8,"column":15},"action":"insert","lines":[" "],"id":356}],[{"start":{"row":8,"column":15},"end":{"row":8,"column":16},"action":"insert","lines":["="],"id":357}],[{"start":{"row":8,"column":16},"end":{"row":8,"column":17},"action":"insert","lines":[" "],"id":358}],[{"start":{"row":8,"column":4},"end":{"row":8,"column":17},"action":"remove","lines":["val verses = "],"id":359}],[{"start":{"row":9,"column":28},"end":{"row":9,"column":37},"action":"remove","lines":["map(_(2))"],"id":360}],[{"start":{"row":9,"column":27},"end":{"row":9,"column":28},"action":"remove","lines":["."],"id":361}],[{"start":{"row":9,"column":26},"end":{"row":9,"column":27},"action":"remove","lines":["s"],"id":362}],[{"start":{"row":9,"column":25},"end":{"row":9,"column":26},"action":"remove","lines":["n"],"id":363}],[{"start":{"row":9,"column":24},"end":{"row":9,"column":25},"action":"remove","lines":["g"],"id":364}],[{"start":{"row":9,"column":23},"end":{"row":9,"column":24},"action":"remove","lines":["i"],"id":365}],[{"start":{"row":9,"column":22},"end":{"row":9,"column":23},"action":"remove","lines":["s"],"id":366}],[{"start":{"row":9,"column":21},"end":{"row":9,"column":22},"action":"remove","lines":["."],"id":367}],[{"start":{"row":9,"column":21},"end":{"row":9,"column":22},"action":"insert","lines":["."],"id":368}],[{"start":{"row":9,"column":22},"end":{"row":9,"column":23},"action":"insert","lines":["g"],"id":369}],[{"start":{"row":9,"column":23},"end":{"row":9,"column":24},"action":"insert","lines":["e"],"id":370}],[{"start":{"row":9,"column":24},"end":{"row":9,"column":25},"action":"insert","lines":["t"],"id":371}],[{"start":{"row":9,"column":22},"end":{"row":9,"column":25},"action":"remove","lines":["get"],"id":372},{"start":{"row":9,"column":22},"end":{"row":9,"column":44},"action":"insert","lines":["getSignsWithSurahNames"]}],[{"start":{"row":9,"column":44},"end":{"row":9,"column":45},"action":"insert","lines":["."],"id":373}],[{"start":{"row":9,"column":45},"end":{"row":9,"column":54},"action":"insert","lines":["map(_(2))"],"id":374}],[{"start":{"row":31,"column":0},"end":{"row":32,"column":0},"action":"remove","lines":["  val signs =  new Quran signs",""],"id":376},{"start":{"row":31,"column":0},"end":{"row":32,"column":0},"action":"insert","lines":["    val signs = quran.getSignsWithSurahNames.map(_(2))",""]}],[{"start":{"row":29,"column":2},"end":{"row":29,"column":4},"action":"insert","lines":["  "],"id":377}],[{"start":{"row":5,"column":30},"end":{"row":5,"column":31},"action":"remove","lines":["a"],"id":378}],[{"start":{"row":5,"column":29},"end":{"row":5,"column":30},"action":"remove","lines":["y"],"id":379}],[{"start":{"row":5,"column":28},"end":{"row":5,"column":29},"action":"remove","lines":["A"],"id":380}],[{"start":{"row":5,"column":27},"end":{"row":5,"column":28},"action":"remove","lines":["h"],"id":381}],[{"start":{"row":5,"column":26},"end":{"row":5,"column":27},"action":"remove","lines":["t"],"id":382}],[{"start":{"row":5,"column":25},"end":{"row":5,"column":26},"action":"remove","lines":["i"],"id":383}],[{"start":{"row":5,"column":24},"end":{"row":5,"column":25},"action":"remove","lines":["W"],"id":384}],[{"start":{"row":42,"column":0},"end":{"row":43,"column":0},"action":"insert","lines":["",""],"id":385}],[{"start":{"row":43,"column":0},"end":{"row":44,"column":0},"action":"insert","lines":["",""],"id":386}],[{"start":{"row":44,"column":0},"end":{"row":54,"column":3},"action":"insert","lines":["","","   ","","  def generateSearchResults(ngram: String): List[List[String]] = {","    val signs = new Quran getSignsWithSurahNames","    ","    //signs.filter(_(2).contains(ngram))","    signs.filter(_(2).matches(\"(?i:.*\" + ngram + \".*)\"))","    ","  }"],"id":387}]]},"ace":{"folds":[],"scrolltop":448.5,"scrollleft":0,"selection":{"start":{"row":54,"column":3},"end":{"row":54,"column":3},"isBackwards":false},"options":{"guessTabSize":true,"useWrapMode":false,"wrapToView":true},"firstLineState":{"row":25,"state":"start","mode":"ace/mode/scala"}},"timestamp":1466297477457,"hash":"2326f6afdf52a86c2a4732f246d260dffa6d0eb8"}