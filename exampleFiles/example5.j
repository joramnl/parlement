.class public example5
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
.limit stack 99
.limit locals 99

ldc 5
loop0:
ldc 1
isub
dup
ldc 0
if_icmplt endloop0
invokestatic example5/printStuff()V
goto loop0
endloop0:
return
.end method
.method public static printStuff()V
.limit stack 99
.limit locals 99

ldc 0
istore 2
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 2
ldc 1
iadd
invokevirtual java/io/PrintStream/println(I)V
return
.end method
