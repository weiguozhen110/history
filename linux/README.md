#权限分为三种(rwx)：
01.读（r=4），写（w=2），执行（x=1）,综合起来还有可读可执行（rx=5=4+1）、可读可写（rw=6=4+2）、可读可写可执行(rwx=7=4+2+1)。
02.chmod 755 设置用户的权限为： 
02.1)文件所有者可读可写可执行 (7)
02.2)与文件所有者同属一个用户组的其他用户可读可执行 (5)
02.3)其它用户组可读可执行 (5) 

#切换工作目录： cd
01.cd    切换到当前用户的主目录(/home/用户目录)，用户登陆的时候，默认的目录就是用户的主目录。
02.cd ~  切换到当前用户的主目录(/home/用户目录)
03.cd .  切换到当前目录
04.cd .. 切换到上级目录
05.cd -  可进入上次所在的目录

#查看文件信息： ls、ls -lah
01.-a            显示指定目录下所有子目录与文件，包括隐藏文件
02.-l            以列表方式显示文件的详细信息
03.-h            配合 -l 以人性化的方式显示文件大小
04.*             文件代表文件名中所有字符
05.ls te*        查找以te开头的文件
06.ls *html      查找结尾为html的文件
07.ls ？         代表文件名中任意一个字符
08.ls ?.c        只找第一个字符任意，后缀为.c的文件
09.ls a.?        只找只有3个字符，前2字符为a.，最后一个字符任意的文件
10.ls [] [”和“]” 将字符组括起来，表示可以匹配字符组中的任意一个。 “-”用于表示字符范围。
11.ls [abc]      匹配a、 b、 c中的任意一个
12.ls [a-f]      匹配从a到f范围内的的任意一个字符
13.ls [af]*      找到从a到f范围内的的任意一个字符开头的文件
14.ls a-f        查找文件名为a-f的文件,当“-”处于方括号之外失去通配符的作用
15.ls \          如果要使通配符作为普通字符使用，可以在其前面加上转义字符。 “?”和“*”处于方括号内时不用使用转义字符就失去通配符的作用。
16.ls \*a        查找文件名为*a的文件
17.ls /home      查看/home目录下的文件

#创建目录： mkdir
01.mkdir a         在当前目录创建文件夹
02.mkdir a/b/c -p  -p可递归创建目录
03.mkdir a b       在当前目录创建多个文件夹
04.mkdir a/{b,c}   在指定目录创建多个文件夹
05.mkdir .abc      以.开头，创建隐藏文件夹

#创建文件: touch 通过touch来创建一个空的文件
01.touch hello.txt

#删除文件： rm
01.rm -r abc
02.rm *  删当前文件夹下所有文件，隐藏文件删不了
03.rm -i 以进行交互式方式执行
04.rm -f 强制删除，忽略不存在的文件，无需提示
05.rm -r 递归地删除目录下的内容，删除文件夹时必须加此参数

#终端命令格式
01.command [-options] [parameter]
02.command   ：命令名，相应功能的英文单词或单词的缩写
03.[-options]：选项，可用来对命令进行控制，也可以省略
04.parameter ：传给命令的参数，可以是零个、一个或者多个
05.[]          代表可选

#man
01.空格键  显示手册页的下一屏
02.Enter  键 一次滚动手册页的一行
03.b      回滚一屏
04.f      前滚一屏
05.q      退出
06./word  搜索word字符串
07.man ls

#拷贝： cp
01.cp 1.txt 2.txt
02.-a 该选项通常在复制目录时使用，它保留链接、文件属性，并递归地复制目录，简单而言，保持文件原有属性。
03.-f 覆盖已经存在的目标文件而不提示
04.-i 交互式复制，在覆盖目标文件之前将给出提示要求用户确认
05.-r 若给出的源文件是目录文件，则cp将递归复制该目录下的所有子目录和文件，目标文件必须为一个目录名。
06.-v 显示拷贝进度

#mv：移动、重命名
01.mv 1.txt 2.txt
02.-f 禁止交互式操作，如有覆盖也不会给出提示
03.-i 确认交互方式操作，如果mv操作将导致对已存在的目标文件的覆盖，系统会询问是否重写，要求用户回答以避免误覆盖文件
04.-v 显示移动进度

#输出重定向命令： >
01.ls > test.txt ( test.txt 如果不存在，则创建，存在则覆盖其内容 )
02.>   输出重定向会覆盖原来的内容
03.>>  输出重定向则会追加到文件的尾部

#查看或者合并查看内容： cat
01.cat 1.txt 2.txt          合并查看内容
02.cat 1.txt 2.txt > 3.txt  将1.txt 2.txt 查看的内容 重定向到文件3.txt

#分屏显示： more
01.more test.txt 
02.空格键   可以显示下一页
03.b       回滚一屏
04.f       前滚一屏
05.Enter键 一次滚动手册页的一行
06.q       退出
07.h键     可以获取帮助

#管道： |
01.管道：一个命令的输出可以通过管道做为另一个命令的输入.
02.ls / | more

#建立链接文件： ln
01.硬链接 ln 源文件 链接文件
02.软链接 ln -s 源文件 链接文件
03.没有-s 选项代表建立一个硬链接文件，两个文件占用相同大小的硬盘空间，即使删除了源文件，链接文件还是存在，所以-s选项是更常见的形式
04.如果软链接文件和源文件不在同一个目录，源文件要使用绝对路径，不能使用相对路径。
05.软链接：软链接不占用磁盘空间，源文件删除则软链接失效。
06.硬链接：硬链接只能链接普通文件，不能链接目录。
07.硬链接：内容保持同步,删除不会同步

#文本搜索： grep
01.grep [-选项] ‘搜索内容串’文件名
02.-v  显示不包含匹配文本的所有行（相当于求反）
03.-n  显示匹配行及行号
04.-i  忽略大小写
05.^a  行首,搜寻以 a 开头的行； grep -n '^a' 1.txt
06.ke$ 行尾,搜寻以 ke 结束的行； grep -n 'ke$' 1.txt
07.[Ss]igna[Ll] 匹配 [] 里中一系列字符中的一个；搜寻匹配单词signal、 signaL、 Signal、 SignaL的行； 
   grep -n '[Ss]igna[Ll]' 1.txt
08..(点)匹配一个非换行符的字符；匹配 e 和 e 之间有任意一个字符，可以匹配 eee， eae， eve，但是不匹配 ee， eaae； 
   grep -n 'e.e' 1.txt
09.-r  搜索目录下所有文件

#查找文件： find
01.find . -name test.sh 查找当前目录下所有名为test.sh的文件
02.find . -name '*.sh' 查找当前目录下所有后缀为.sh的文件

#归档管理： tar
01.tar使用格式 tar [参数] 打包文件名 文件
02.tar -cvf a.tar *.txt     打包
03.tar -xvf a.tar -C a_tar  解包,如果指定路径需要加参数 C（大写）
04.-c 生成档案文件，创建打包文件
05.-v 列出归档解档的详细过程，显示进度
06.-f 指定档案文件名称
07.-t 列出档案中包含的文件
08.-x 解开档案文件
09.tar命令很特殊，其参数前面可以使用“-”，也可以不使用
10.f需要该参数且要放到参数后边
11.-z 调用gzip 打包压缩
12.-j 压缩用法： tar -jcvf 压缩包包名 文件...(tar jcvf bk.tar.bz2 *.c)
      解压用法： tar -jxvf 压缩包包名 (tar jxvf bk.tar.bz2)

#文件压缩解压： gzip
01.gzip使用格式 gzip [选项] 被压缩文件
02.-d 解压
03.-r 压缩所有子目录
04.tar这个命令并没有压缩的功能，它只是一个打包的命令，但是在tar命令中增加一个选项(-z)可以调用gzip实现了一个压缩的功能，实行一个先打包后压缩的过程
05.压缩用法： tar cvzf 压缩包包名 文件1 文件2 ...
   -z ：指定压缩包的格式为： file.tar.gz
06.解压用法： tar zxvf 压缩包包名
   -z ：指定压缩包的格式为： file.tar.gz
07.解压到指定目录： -C （大写字母“C”） 

#文件压缩解压： bzip2
01.tar与bzip2命令结合使用实现文件打包、压缩(用法和gzip一样)

#文件压缩解压： zip、 unzip
01.通过zip压缩文件的目标文件不需要指定扩展名，默认扩展名为zip。
02.压缩文件： zip [-r] 目标文件(不写没有扩展名，会自动生成) 源文件
03.解压文件： unzip -d 解压后目录文件 压缩文件（自动创建目录）

#压缩率 zip<gzip<bzip2
#通用性 zip>gzip>bzip2

#查看命令位置： which
01.which zip

#切换到管理员账号
01.su       切换到root用户,或su root
02.su admin 切换到admin用户

#设置用户密码： passwd
01.passwd

#退出登录账户： exit
01.exit

#查看登录用户： who
01.q或--count 只显示用户的登录账号和登录用户的数量
02.-u或--heading 显示列标题
03.登录方式 
   root tty1  用户登录
   root pts/0 终端方式登录
   
#pkill 
01.pkill -kill -t pts/2

#关机重启： reboot、 shutdown
01.reboot 重新启动操作系统
02.shutdown –r now 重新启动操作系统， shutdown会给别的用户提示
03.shutdown -h now 立刻关机，其中now相当于时间为0的状态
04.shutdown -h 20:25 系统在今天的20:25 会关机
05.shutdown -h +10 系统再过十分钟后自动关机

#修改文件权限： chmod
01.字母法： chmod u/g/o/a +/-/= rwx 文件
02.u user 表示该文件的所有者
03.g group 表示与该文件的所有者属于同一组( group )者，即用户组
04.o other 表示其他以外的人
05.a all 表示这三者皆是
06.+ 增加权限
07.- 撤销权限
08.= 设定权限
09.r read   表示可读取，对于一个目录，如果没有r权限，那么就意味着不能通过ls查看这个目录的内容。
10.w write  表示可写入，对于一个目录，如果没有w权限，那么就意味着不能在目录下创建新的文件。
11.x excute 表示可执行，对于一个目录，如果没有x权限，那么就意味着不能通过cd进入这个目录
12.数字法： chmod 751 文件
13.r 读取权限，数字代号为 "4"
14.w 写入权限，数字代号为 "2"
15.x 执行权限，数字代号为 "1"
16.- 不具任何权限，数字代号为 "0"
17.chmod u=rwx,g=rx,o=r 文件 就等同于： chmod u=7,g=5,o=4 文件
18.-R 递归所有目录加上相同权限，如： chmod 777 test/ -R 递归 test 目录下所有文件加 777 权限

##编辑器 vim
01.进入插入模式
   i: 插入光标前一个字符
   I: 插入行首
   a: 插入光标后一个字符
   A: 插入行未
   o: 向下新开一行,插入行首
   O: 向上新开一行,插入行首
02.进入命令模式: ESC
02.1)移动光标:
    h: 左移
    j: 下移
    k: 上移
    l: 右移
    M: 光标移动到中间行
    L: 光标移动到屏幕最后一行行首
    G: 移动到指定行,行号 -G
    w: 向后一次移动一个字
    b: 向前一次移动一个字
    {: 按段移动,上移
    }: 按段移动,下移
    Ctr-d: 向下翻半屏
    Ctr-u: 向上翻半屏
    Ctr-f: 向下翻一屏
    Ctr-b: 向上翻一屏
    gg: 光标移动文件开头
    G: 光标移动到文件末尾
02.2)删除命令:
    x: 删除光标后一个字符,相当于 Del
    X: 删除光标前一个字符,相当于 Backspace
    dd: 删除光标所在行,n dd 删除指定的行数 D: 删除光标后本行所有内容,包含光标所在字符
    d0: 删除光标前本行所有内容,不包含光标所在字符
    dw: 删除光标开始位置的字,包含光标所在字符
02.3)撤销命令:
    u: 一步一步撤销
    Ctr-r: 反撤销
02.4)重复命令:
    .: 重复上一次操作的命令
02.5)文本行移动:
    >>: 文本行右移
    <<: 文本行左移
02.6)复制粘贴:
    yy: 复制当前行,n yy 复制 n 行
    p:  在光标所在位置向下新开辟一行,粘贴
02.7)可视模式:
    v: 按字符移动,选中文本
    V: 按行移动,选中文本可视模式可以配合 d, y, >>, <<实现对文本块的删除,复制,左右移动
02.8)替换操作:
    r: 替换当前字符
    R: 替换当前行光标后的字符，直到按esc
02.9)查找命令:
    /: str查找
    n: 下一个
    N：上一个






   
