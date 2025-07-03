软件包示例；

导入弧。*；
进口arc.util.*；
进口行业。*；
进口mindustry.content.*；
导入mindustry.game.EventType.*；
进口mindustry.gen.*；
进口mindustry.mod.*；
进口mindustry.ui.dialogs.*；

公共类ExampleJavaMod扩展Mod{

公共 ExampleJavaMod(){
日志。信息("加载的示例JavaMod构造函数。")；

//侦听游戏加载事件
事件。在……之上(ClientLoadEvent。班级，e->{
//启动时显示对话框
时间.RunTask(10FTime.runTask(10f，()->{()->{{
BaseDialog对话框=新建BaseDialog("青蛙")“frog”
dialog.cont.添加(“看”)。行()；
//mod精灵以mod名称作为前缀(此mod在其配置中称为"示例-java-mod")
对话。连续图像(核心阿特拉斯。找到("my-first-java-mod-frog").垫(20F)。行()；
dialog.cont.按钮("我明白了"，对话：：隐藏).大小(100F，50F)；
对话。显示()；
            });
        });
    }

@Override
公共空隙荷载内容(){
日志。信息("加载一些示例内容。")；
    }

}
