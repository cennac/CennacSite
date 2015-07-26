# SpringMVC
@RequestMapping(value = "param",method = RequestMethod.GET,params = {"params1","params2!=10"},header={"params1","params2!=10"})
value:路径 可使用ant风格通配符?、*、**分别代表单一字符、一层路径内多个字符、多层路径
params、header:
params = "params1"   必须包含params1参数
params = "!params1"     必须不包含
params = "params=1"   必须包含params1参数，且值必须是1
params = "params!=1"   必须包含params1参数，且值必须不是1
params = {"params1","params2!=10"}      必须包含params1、params2两个参数，且params2的值不是10
------------------------------------------------------------------------------------------------------
@PathVariable   映射URL绑定的占位符
例子：
@RequestMapping("/delete/{id}") //路径中{}占位符需要跟@PathVariable参数一致
public String delete(@PathVariable("id") int aa){
    System.out.println(aa);
    return "success";
}
---
@RequestParam   请求参数
@RequestParam(value="请求参数名",required=false,defaultValue="0")
