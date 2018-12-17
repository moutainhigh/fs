package com.lswd.youpin.commons;

/**
 * Created by liruilong on 16/9/19.
 * <p>
 * 系统异常错误码定义：采用9为数字格式，前三位为系统编码，中间三位为模块编码，后三位为错误编码。
 * 1)	前三位：中旅总社后台系统编码为：100，手机银行后台系统编码为200。
 * 2)	中间三位：各系统自行定义，从001开始。如：用户模块001，订单模块002。
 * 3)  后三位：各系统自行定义，从001开始。如：用户密码不正确001。
 * 例子：如果中间三位001代表用户模块，后三位001代表用户密码不正确，那么异常编码为100001001
 */
public enum CodeMessage {
    // 例子
    SUCCESS("100000000", "成功"),
    FAILED("100000001", "失败"),
    /*******************************************************************/
    /***********************  总社-系统异常100000XXX  ********************/
    /*******************************************************************/
    SYSTEM_BUSY("100000001", "系统繁忙,请稍后重试"),
    PARAMS_ERR("100000002", "请求参数异常"),
    SYSTEM_NOT_FOUND("100000003", "没有找到资源,请稍后重试"),
    SYSTEM_SYNTAX_ERROR("100000004", "参数语法错误,请稍后重试"),
    SYSTEM_ERR("100000005", "内部错误,请稍后重试"),//主要针对数据库连接超时的时候定义的异常,为了出现错误的时候看错误码就能够知道数据库挂掉了
    SMS_SEND_ERR("100000006", "验证码一天只能发送三条"),
    SMS_SEND_INTERSACE_ERR("100000007", "验证码接口调用错误"),
    TOKEN_TIME_OUT("100000008","token超时"),
    TOKEN_NO_ERR("100000009","你没有权限登录"),
    EMPTY_DATA("100000010","该列表暂无数据"),
    PARAM_ERR("100000011","参数错误"),
    DATA_DEL_ERR("100000011","删除错误"),
    DATA_UPDATE_ERR("100000011","更新失败"),
    DATA_ADD_ERR("100000011","更新失败"),

    /*******************************************************************/
    /***********************  用户管理100001XXX  ********************/
    /*******************************************************************/
    USER_REGIST_SUCCESS("100001010", "注册成功"),
    USER_REGIST_ERR("100001011", "注册失败"),
    USER_LOGIN_SUCCESS("100001020", "登录成功"),
    USER_LOGIN_NO("100001021", "密码和账号不正确"),
    USER_UPDATE_PASSWORD_SUCCESS("100001022", "修改密码成功"),
    USER_UPDATE_PASSWORD_ERR("100001023", "密码修改失败"),
    USER_NO_PASSWORD_ERR("100001024", "密码不正确"),
    USER_NO_USER_ERR("100001025", "用户不存在"),
    USER_NO_CODE("100001026", "图片验证码错误"),
    USER_TIME_CODE("100001027", "图片验证码超时，请重新刷新验证码"),
    USER_TIME_ERR("100001028", "连续登录失败5次,请24小时后再登录"),
    USER_ADD_SUCCESS("100001030", "用户添加成功"),
    USER_ADD_ERR("100001031", "用户添加失败"),
    USER_YE_LOGIN_ERR("100001032", "用户名已被注册"),
    USER_MESSAGE_ERR("100001033", "用户信息填写错误或账号不存在"),
    USER_UPDATE_SUCCESS("100001040", "用户信息修改成功"),
    USER_UPDATE_ERR("100001041", "用户信息修改失败"),
    USER_DELETE_SUCCESS("100001050", "用户删除成功"),
    USER_DELETE_ERR("100001051", "用户删除失败"),
    USER_NO_SELECT("100001060", "未查到用户信息"),
    USER_NO_TIME("100001061", "用户登录超时"),
    USER_CHINA_WEN("100001062", "用户账号不能为中文"),
    USER_NO_UUID("100001063", "UUID不能为空"),
    USER_MSG_CODE_ERR("100001064", "短信验证码错误"),
    USER_NO_PHONE("100001065", "电话号码和用户电话号码不匹配"),
    USER_OLD_PASSWORD_ERR("100001067", "旧密码不正确"),
    USER_INIT_PASSWORD_ERR("100001068", "密码初始化失败"),
    /*******************************************************************/
    /***********************  部门管理100005XXX  ********************/
    /*******************************************************************/
    DEPARTMENT_ADD_SUCCESS("100005010", "部门新建成功"),
    DEPARTMENT_ADD_ERR("100005011", "部门新建失败"),
    DEPARTMENT_NO_ERR("100005013", "部门信息不能为空"),
    DEPARTMENT_DELETE_SUCCESS("100005020", "部门删除成功"),
    DEPARTMENT_DELETE_ERR("100005021", "部门删除失败"),
    DEPARTMENT__DELETE_YE_EMP("100005022", "部门有员工不能删除"),
    DEPARTMENT__UPDATE_SUCCESS("100005030", "部门信息修改成功"),
    DEPARTMENT__UPDATE_ERR("100005031", "部门信息修改失败"),
    DEPARTMENT__NO_HAVE("100005040", "部门不存在"),
    DEPARTMENT__NO_SELECT("100005050", " 未查到部门信息"),
    /*******************************************************************/
    /***********************  员工管理100006XXX  ********************/
    /*******************************************************************/
    EMPLOYEE_ADD_SUCCESS("100006010", "添加员工成功"),
    EMPLOYEE_ADD_ERR("100006011", "添加员工失败"),
    EMPLOYEE_NO_ERR("100006012", "员工信息不能为空"),
    EMPLOYEE_YE_NUM("100006013", "员工编号已存在"),
    EMPLOYEE_DELETE_SUCCESS("100006020", "成功删除员工"),
    EMPLOYEE_DELETE_ERR("100006021", "删除员工失败"),
    EMPLOYEE_YE_ASSOCIATOR("100006020", "成功删除员工"),
    EMPLOYEE_UPDATE_SUCCESS("100006030", "成功修改员工信息"),
    EMPLOYEE_UPDATE_ERR("100006031", "修改员工信息失败"),
    EMPLOYEE_NO_SELECT("100006040", "未查到员工信息"),
    EMPLOYEE_NO_DELETE("100006041", "该员工是会员，请先删除会员在删除员工"),
    /*******************************************************************/
    /***********************  地址管理100007XXX  ********************/
    /*******************************************************************/
    ADDRESS_ADD_SUCCESS("100007010", "添加地址成功"),
    ADDRESS_ADD_ERR("100007011", "添加地址失败"),
    ADDRESS_NO_ERR("100007012", "无地址信息"),
    ADDRESS_DELETE_SUCCESS("100007020", "地址删除成功"),
    ADDRESS_DELETE_ERR("100007021", "地址删除失败"),
    ADDRESS_UPDATE_SUCCESS("100007030", "修改地址信息成功"),
    ADDRESS_UPDATE_ERR("100007031", "修改地址信息失败"),
    ADDRESS_NO_SELECT("100007032", "未查到地址信息"),
    /*******************************************************************/
    /***********************  商家微信用户管理100008XXX  ********************/
    /*******************************************************************/
    TENANTASSOCIATOR_ADD_SUCCESS("100008010", "商家微信用户追加成功"),
    TENANTASSOCIATOR_ADD_ERR("100008011", "商家微信用户追加失败"),
    TENANTASSOCIATOR_NO_ERR("100008012", "没有该商家微信用户信息"),
    TENANTASSOCIATOR_DELETE_SUCCESS("100008020", "商家微信用户删除成功"),
    TENANTASSOCIATOR_DELETE_ERR("100008021", "商家微信用户删除失败"),
    TENANTASSOCIATOR_UPDATE_SUCCESS("100008030", "修改成功"),
    TENANTASSOCIATOR_UPDATE_ERR("100008031", "修改失败"),
    TENANTASSOCIATOR_NO_SELECT("100008032", "未查到商家用户信息"),
    TENANTASSOCIATOR_NO_PASSWORD("100008033", "用户密码和账号不匹配"),
    TENANTASSOCIATOR_NO_ACCOUNT("100008034", "账号不存在"),
    TENANTASSOCIATOR_YE_ACCOUNT("100008041", "改账号已经被注册"),
    TENANTASSOCIATOR_NO_CAN("100008035", "参数错误"),
    TENANTASSOCIATOR_NO_CANTEEN("100008036", "用户没有绑定餐厅"),
    TENANTASSOCIATOR_NO_PHONE("100008037", "没有绑定手机号"),
    TENANTASSOCIATOR_PASSWORD_ERR("100008038", "密码输入错误"),
    TENANTASSOCIATOR_SMS_ERR("100008039", "短信验证码错误"),

    /*******************************************************************/
    /***********************  会员管理100002XXX  ********************/
    /*******************************************************************/
    ASSOCIATOR_ADD_SUCCESS("100002010", "会员添加成功"),
    ASSOCIATOR_ADD_ERR("100002011", "会员添加失败"),
    ASSOCIATOR_NO_ERR("100002013", "会员账号或密码不正确"),
    ASSOCIATOR_LOGIN_SUCCESS("100002014", "会员登录成功"),
    ASSOCIATOR_LOGIN_TIMEOUT("100002015", " 连续登录次数超过5次，请4小时后在登录"),
    ASSOCIATOR_NO_ACCOUNT("100002016", "该会员不存在，请注册"),
    ASSOCIATOR_YE_LOCK("100002050", "账号被锁定"),
    ASSOCIATOR_LOCK_SUCCESS("100002017", "会员锁定(解锁)成功"),
    ASSOCIATOR_LOCK_ERR("100002018", "会员锁定(解锁)失败"),
    ASSOCIATOR_NO_CANTEEN("100002019", "没有绑定餐厅"),
    ASSOCIATOR_DELETE_SUCCESS("100002020", "会员删除成功"),
    ASSOCIATOR_DELETE_ERR("100002021", "会员删除失败"),
    ASSOCIATOR_UPDATE_SUCCESS("100002030", "会员信息修改成功"),
    ASSOCIATOR_UPDATE_ERR("100002031", "会员信息修改失败"),
    ASSOCIATOR_BIND_PHONE("100002041", "和员工预留手机号不一致，重新绑定"),
    ASSOCIATOR_NO_MESSAGE("100002042", "参数错误"),
    ASSOCIATOR_NO_SMSCODE("100002043", "短信验证码不正确"),
    ASSOCIATOR_BIND_SUCCESS("100002044", "会员绑定餐厅成功"),
    ASSOCIATOR_BIND_ERR("100002045", "会员绑定餐厅失败"),
    ASSOCIATOR_IMAGE_ERR("100002046", "图片验证码错误"),
    ASSOCIATOR_NO_PHONE("100002047", "手机号码不能为空"),
    ASSOCIATOR_YE_PHONE("100002048", "该手机号已被注册"),
    ASSOCIATOR_NO_PHONE_ERR("100002049", "该手机号未注册，请注册会员账户"),
    ASSOCIATOR_UPDATE_PASSWORD_SUCCESS("100002050", "密码修改成功"),
    ASSOCIATOR_UPDATE_PASSWORD_ERR("100002051", "密码修改失败"),
    ASSOCIATOR_NO_CARD("100002052", "该会员未绑定餐卡"),
    ASSOCIATOR_YE_LOGIN("100002053", "请登录"),
    ASSOCIATOR_NO_PASSWORD("100002054", "密码不正确"),
    ASSOCIATOR_YE_CANTEEN_BIND("100002055", "餐厅绑定成功"),
    ASSOCIATOR_NO_CANTEEN_BIND("100002056", "餐厅绑定失败"),
    ASSOCIATOR_NO_RECHARGE("100002057", "充值金额不能为0"),
    /*******************************************************************/
    /***********************  供应商管理100003XXX  ********************/
    /*******************************************************************/
    SUPPLIER_ADD_SUCCESS("100003010", "供应商新建成功"),
    SUPPLIER_ADD_ERR("100003011", "供应商新建失败"),
    SUPPLIER_NO_ERR("100003012", "没有供应商信息"),
    SUPPLIER_DELETE_SUCCESS("100003020", "供应商删除成功"),
    SUPPLIER_DELETE_ERR("100003021", "供应商删除失败"),
    SUPPLIER_UPDATE_SUCCESS("100003030", "供应商信息修改成功"),
    SUPPLIER_UPDATE_ERR("100003031", "供应商信息修改失败"),
    SUPPLIER_NO_CAN("100003032", "参数错误"),
    /*******************************************************************/
    /***********************  会员购物车100004XXX  ********************/
    /*******************************************************************/
    CAR_ADD_SUCCESS("100004010", "添加购物车成功"),
    CAR_ADD_ERR("1000040101", "添加购物车失败"),
    CAR_NO_ERR("1000040102", "没有更多信息了"),
    CAR_DELETE_SUCCESS("100004020", "删除成功"),
    CAR_DELETE_ERR("100004021", "删除失败"),
    CAR_UPDATE_SUCCESS("100004030", "修改成功"),
    CAR_UPDATE_ERR("100004031", "修改失败"),
    CAR_REMOVE_ALL_SUCCESS("100004040", "购物车已清空"),
    CAR_REMOVE_ALL_ERR("100004041", "购物车清空失败"),
    CAR_NO_COUNT("100004042", "商品库存不足,现在库存为"),
    CAR_TIME_OUT("100004043", "请预购明天的商品谢谢"),
    CAR_ADD_ERR_COUNT("100004044", "促销商品只能一人一份"),
    CAR_DELETE_COUNT("100004045", "你取消了促销商品"),
    /*******************************************************************/
    /***********************  材料管理100008XXX  ********************/
    /*******************************************************************/
    MATERIAL_ADD_SUCCESS("100008010", "材料添加成功"),
    MATERIAL_ADD_ERR("100008011", "材料添加失败"),
    MATERIAL_NO_ERR("100008012", "没有材料信息"),
    MATERIAL_DELETE_SUCCESS("100008020", "材料删除成功"),
    MATERIAL_DELETE_ERR("100008021", "材料删除失败"),
    MATERIAL_UPDATE_SUCCESS("100008030", "材料信息修改成功"),
    MATERIAL_UPDATE_ERR("100008031", "材料信息修改失败"),
    MATERIAL_YES_CATEGORY("100008032", "改材料分类已存在"),
    MATERIAL_DELETE_CATEGORY("100008033", "材料分类删除失败"),
    /*******************************************************************/
    /***********************  订单管理100009XXX  ********************/
    /*******************************************************************/
    RECIPEORDER_NO_ERR("100009011", "没有订单信息"),
    RECIPEORDER_NO_FLAG("100009012", "订单类型不存在"),
    ORDER_ADD_ERR("100009013", "订单添加失败"),
    ORDER_TIME_OUT("100009014", "订单支付超时,自动取消"),
    ORDER_DELETE_SUCCESS("100009015", "订单删除成功"),
    ORDER_DELETE_ERR("100009016", "订单删除失败"),
    ORDER_CANCEL_SUCCESS("100009017", "订单取消成功"),
    ORDER_CANCEL_ERR("100009018", "订单取消失败"),
    ORDER_TIME_CAN_ERR("100009019", "查询参数错误"),
    /*******************************************************************/
    /***********************  用户评论管理1000091XX  ********************/
    /*******************************************************************/
    EVALUATE_NO_ERR("100009110", "评论信息不能为空"),
    EVALUATE_ADD_SUCCESS("100009111", "评论信息追加成功"),
    EVALUATE_ADD_ERR("100009112", "评论信息追加失败"),
    EVALUATE_CAN_ERR("100009113", "参数错误"),
    EVALUATE_NO_VIEW("100009120", "该商品没有评论"),
    /*******************************************************************/
    /***********************  统计管理1000092XX  ********************/
    /*******************************************************************/
    STATISTICS_NO_ERR("100009210", "没有统计数据"),
    STATISTICS_NO_SALES("10000921", "没有销售信息"),

    /*******************************************************************/
    /***********************  角色管理1000010XXX  ********************/
    /*******************************************************************/
    ROLE_ADD_ERR("1000010001", "角色添加失败"),
    ROLE_UPDATE_ERR("1000010002", "角色更新失败"),
    ROLE_SELECT_ERR("1000010003", "角色获取失败"),
    ROLE_DELETE_ERR("1000010004", "角色删除失败"),
    ROLE_ADD_POWER_ERR("1000010005", "角色赋权失败"),
    ROLE_ADD_DESCRIPTION_ERR("1000010006", "角色描述不能为空"),
    ROLE_DELETE_LINK_ERR("1000010007", "角色和用户关联不能删除"),
    ROLE_UPDATE_LINK_ERR("1000010008", "当前角色正在使用不能被禁用"),
    ROLE_ADD_NAME_ERR("1000010009", "角色名称请输入1-30个中文，数字，字母的字符"),
    ROLE_ADD_DESCRIPTION_CANNOT_ERR("10000100010", "角色描述不能超过50个字符"),
    ROLE_DUPLICATION_ERR("10000100011", "该角色名称已存在"),
    ROLE_SELECT_POWER_ERR("10000100011", "获取角色权限失败"),

    /*******************************************************************/
    /*********************** 菜单管理1000011XXX  ********************/
    /*******************************************************************/
    MENU_SELECT_ERR("1000011001", "菜单获取失败"),
    /*******************************************************************/
    /***********************文件上传管理1000012XXX  ********************/
    /*******************************************************************/
    FILE_UPLOAD_ERR("1000012001", "文件上传失败"),
    FILE_FORMAT_ERR("1000012002", "文件格式不正确"),

    /*******************************************************************/
    /***********************租户管理1000013XXX  ********************/
    /*******************************************************************/
    TENANT_SELECT_ERR("1000013001", "租户查询失败"),
    TENANT_DELETE_ERR("1000013002", "租户删除失败"),
    TENANT_UPDATE_ERR("1000013003", "租户更新失败"),
    TENANT_ADD_ERR("1000013004", "租户添加失败"),
    TENANT_DELETE_LINK_ERR("1000013005", "商家下有租户，不能删除"),


    /*******************************************************************/
    /***********************区域管理1000014XXX  ********************/
    /*******************************************************************/
    INSTITUTION_SELECT_ERR("1000014001", "区域查询失败"),
    INSTITUTION_DELETE_ERR("1000014002", "区域删除失败"),
    INSTITUTION_UPDATE_ERR("1000014003", "区域更新失败"),
    INSTITUTION_ADD_ERR("1000014004", "区域添加失败"),
    INSTITUTION_DELETE_LINK_ERR("1000014005", "区域下有餐厅，不能删除"),

    /*******************************************************************/
    /***********************餐厅管理1000015XXX  ********************/
    /*******************************************************************/
    CANTEEN_SELECT_ERR("1000015001", "餐厅查询失败"),
    CANTEEN_DELETE_ERR("1000015002", "餐厅删除失败"),
    CANTEEN_UPDATE_ERR("1000015003", "餐厅更新失败"),
    CANTEEN_ADD_ERR("1000015004", "餐厅添加失败"),
    CANTEEN_SELECT_LOCATION_ERR("1000015005", "查询餐厅地理位置失败"),
    CANTEEN_ADD_SUPPLIER_ERR("1000015006", "添加供应商失败"),
    CANTEEN_NO_ERR("1000015007", "该餐厅已不在经营"),

    /*******************************************************************/
    /***********************商品管理1000016XXX  ********************/
    /*******************************************************************/
    GOOD_ADD_SUCCESS("1000016001", "商品添加成功"),
    GOOD_ADD_ERR("1000016002", "商品添加失败"),
    GOOD_DELETE_SUCCESS("1000016003", "商品删除成功"),
    GOOD_DELETE_ERR("1000016004", "商品删除失败"),
    GOOD_UPDATE_SUCCESS("1000016005", "商品更新成功"),
    GOOD_UPDATE_ERR("1000016006", "商品更新失败"),
    GOOD_SELECT_SUCCESS("1000016007", "商品列表查询成功"),
    GOOD_SELECT_ERR("1000016008", "商品列表查询失败"),
    GOOD_SELECTTYPE_SUCCESS("1000016009", "根据类别查找商品成功"),
    GOOD_SELECTTYPE_ERR("10000160010", "根据类别查找商品失败"),
    GOOD_GETGOODADDITIVEATTRIBUTE_SUCCESS("1000016011", "查看商品详情成功"),
    GOOD_GETGOODADDITIVEATTRIBUTE_ERR("1000015012", "查看商品详情失败"),

    GOODPLAN_ADDGOODPLAN_SUCCESS("1000016013", "商品计划添加成功"),
    GOODPLAN_ADDGOODPLAN_ERR("1000016014", "商品计划添加失败"),
    GOODPLAN_DELETEGOODPLAN_SUCCESS("1000016015", "商品计划删除成功"),
    GOODPLAN_DELETEGOODPLAN_ERR("1000016016", "商品计划删除失败"),
    GOODPLAN_UPDATEGOODPLAN_SUCCESS("1000016017", "商品计划更新成功"),
    GOODPLAN_UPDATEGOODPLAN_ERR("1000016018", "商品计划更新失败"),
    GOODPLAN_GETGOODPLANLIST_SUCCESS("1000016019", "商品计划列表查询成功"),
    GOODPLAN_GETGOODPLANLIST_ERR("1000016020", "商品计划列表查询失败"),
    GOODPLAN_GETGOODPLANDETAILS_SUCCESS("1000016021", "查看商品计划详情成功"),
    GOODPLAN_GETGOODPLANDETAILS_ERR("10000160022", "查看商品计划详情失败"),
    GOODPLAN_GETGOODPLAN_NO_ERR("10000160023", "今天没有售卖计划"),

    /*******************************************************************/
    /***********************菜谱管理1000017XXX  ********************/
    /*******************************************************************/
    RECIPE_INSERTRECIPE_SUCCESS("1000017001", "菜谱添加成功"),
    RECIPE_INSERTRECIPE_ERR("1000017002", "菜谱添加失败"),
    RECIPE_DELETERECIPE_SUCCESS("1000017003", "菜谱删除成功"),
    RECIPE_DELETERECIPE_ERR("1000017004", "菜谱删除失败"),
    RECIPE_UPDATERECIPE_SUCCESS("1000017005", "菜谱更新成功"),
    RECIPE_UPDATERECIPE_ERR("1000017006", "菜谱更新失败"),
    RECIPE_GETRECIPELIST_SUCCESS("1000017007", "菜谱列表查询成功"),
    RECIPE_GETRECIPELIST_ERR("1000017008", "菜谱列表暂无数据"),
    RECIPE_GETRECIPEDETAILS_SUCCESS("1000017009", "菜谱详情查询成功"),
    RECIPE_GETRECIPEDETAILS_ERR("1000017010", "菜谱详情查询失败"),

    RECIPEPLAN_INSERTRECIPEPLAN_SUCCESS("1000017011", "菜谱计划添加成功"),
    RECIPEPLAN_INSERTRECIPEPLAN_ERR("1000017012", "菜谱计划添加失败"),
    RECIPEPLAN_DELETERECIPEPLAN_SUCCESS("1000017013", "菜谱计划删除成功"),
    RECIPEPLAN_DELETERECIPEPLAN_ERR("1000017014", "菜谱计划删除失败"),
    RECIPEPLAN_UPDATERECIPEPLAN_SUCCESS("1000017015", "菜谱计划更新成功"),
    RECIPEPLAN_UPDATERECIPEPLAN_ERR("1000017016", "菜谱计划更新失败"),
    RECIPEPLAN_GETRECIPEPLANLIST_SUCCESS("1000017017", "菜谱计划列表查询成功"),
    RECIPEPLAN_GETRECIPEPLANLIST_ERR("1000017018", "菜谱计划列表查询失败"),
    RECIPEPLAN_GETRECIPEPLANDETAILS_SUCCESS("1000017019", "菜谱计划详情查询成功"),
    RECIPEPLAN_GETRECIPEPLANDETAILS_ERR("1000017020", "菜谱计划详情查询失败"),

    /*******************************************************************/
    /***********************园区管理1000018XXX  ********************/
    /*******************************************************************/

    REGION_ADD_ERR("1000018001", "园区添加失败"),
    REGION_UPDATE_ERR("10000180012", "园区更新失败"),
    REGION_SELECT_ERR("10000180013", "园区查找失败"),
    REGION_DELETE_ERR("10000180014", "园区删除失败"),


    /*******************************************************************/
    /***********************标签管理1000019XXX  ********************/
    /*******************************************************************/

    LABEL_SCAN_ERR("1000019001", "标签读取失败"),
    LABEL_ADD_ERR("1000019002", "标签添加失败"),
    LABEL_UPDATE_ERR("1000019003", "标签更新失败"),
    LABEL_SELECT_ERR("1000019004", "标签查找失败"),
    LABEL_DELETE_ERR("1000019005", "标签删除失败"),
    DISK_RECIPE_DELETE_ERR("1000019006", "餐具和菜品关联关系删除失败"),
    DISK_RECIPE_SELECT_ERR("1000019007", "餐具和菜品关联关系查询失败"),
    DISK_RECIPE_UPDATE_ERR("1000019008", "餐具和菜品关联关系更新失败"),
    DISK_RECIPE_ADD_ERR("1000019009", "餐具和菜品关联关系添加失败"),
    SINGLE_LABEL_UPDATE_ERR("1000019010", "修改单个餐具失败"),
    /*******************************************************************/
    /***********************标签管理1000020XXX  ********************/
    /*******************************************************************/
    MACHINE_NO_ERR("1000020001", "没有设备"),
    MACHINE_ADD_SUCCESS("1000020002", "添加设备成功"),
    MACHINE_ADD_ERR("1000020003", "添加设备失败"),
    MACHINE_UPDATE_ERR("1000020004", "更新设备失败"),
    MACHINE_UPDATE_SUCCESS("1000020005", "更新设备成功"),
    MACHINE_DEL_ERR("1000020006", "删除设备失败"),
    MACHINE_DEL_SUCCESS("1000020007", "删除设备成功"),
    MACHINE_SELECT_ERR("1000020008", "查询设备列表失败"),

    /*******************************************************************/
    /***********************标签管理1000021XXX  ********************/
    /*******************************************************************/
    APP_RESOURCE_NO_ERR("1000021001", "没有查询到菜单"),
    APP_RESOURCE_ADD_SUCCESS("1000021002", "添加菜单成功"),
    APP_RESOURCE_ADD_ERR("1000021003", "添加菜单失败"),
    APP_RESOURCE_UPDATE_ERR("1000021004", "更新菜单失败"),
    APP_RESOURCE_UPDATE_SUCCESS("1000021005", "更新菜单成功"),
    APP_RESOURCE_DEL_ERR("1000021006", "删除菜单失败"),
    APP_RESOURCE_DEL_SUCCESS("1000020007", "删除菜单成功"),
    APP_RESOURCE_SELECT_ERR("1000021008", "查询菜单列表失败"),
    /*******************************************************************/
    /***********************标签管理1000022XXX  ********************/
    /*******************************************************************/
   APP_RESOURCE_MACHINE_NO_ERR("1000022001", "没有绑定菜单"),
   APP_RESOURCE_MACHINE_ADD_SUCCESS("1000022002", "添加绑定菜单成功"),
   APP_RESOURCE_MACHINE_ADD_ERR("1000022003", "添加绑定菜单失败"),
   APP_RESOURCE_MACHINE_UPDATE_ERR("1000022004", "更新绑定菜单失败"),
   APP_RESOURCE_MACHINE_UPDATE_SUCCESS("1000022005", "更新绑定菜单成功"),
   APP_RESOURCE_MACHINE_DEL_ERR("1000022006", "删除绑定菜单失败"),
   APP_RESOURCE_MACHINE_DEL_SUCCESS("1000020007", "删除绑定菜单成功"),
   APP_RESOURCE_MACHINE_SELECT_ERR("1000022008", "查询绑定菜单列表失败"),
    /*******************************************************************/
    /***********************标签管理1000023XXX  ********************/
    /*******************************************************************/
    RES_TYPE_NO_ERR("1000023001", "没有资源类型"),
    RES_TYPE_ADD_SUCCESS("1000023002", "添加资源类型成功"),
    RES_TYPE_ADD_ERR("1000023003", "添加资源类型失败"),
    RES_TYPE_UPDATE_ERR("1000023004", "更新资源类型失败"),
    RES_TYPE_UPDATE_SUCCESS("1000023005", "更新资源类型成功"),
    RES_TYPE_DEL_ERR("1000023006", "删除资源类型失败"),
    RES_TYPE_DEL_SUCCESS("1000023007", "删除资源类型成功"),
    RES_TYPE_SELECT_ERR("1000023008", "查询资源类型列表失败"),
    /*******************************************************************/
    /***********************标签管理1000024XXX  ********************/
    /*******************************************************************/
    IMG_NO_ERR("1000024001", "没有图片"),
    IMG_ADD_SUCCESS("1000024002", "添加图片成功"),
    IMG_ADD_ERR("1000024003", "添加图片失败"),
    IMG_UPDATE_ERR("1000024004", "更新图片失败"),
    IMG_UPDATE_SUCCESS("1000024005", "更新图片成功"),
    IMG_DEL_ERR("1000024006", "删除图片失败"),
    IMG_DEL_SUCCESS("1000024007", "删除图片成功"),
    IMG_SELECT_ERR("1000024008", "查询图片类型列表失败"),
    /*******************************************************************/
    /***********************Banner管理1000025XXX  ********************/
    /*******************************************************************/
    BANNER_NO_ERR("1000025001", "没有banner"),
    BANNER_ADD_SUCCESS("1000025002", "添加banner成功"),
    BANNER_ADD_ERR("1000025003", "添加banner失败"),
    BANNER_UPDATE_ERR("1000025004", "更新banner失败"),
    BANNER_UPDATE_SUCCESS("1000025005", "更新banner成功"),
    BANNER_DEL_ERR("1000025006", "删除banner失败"),
    BANNER_DEL_SUCCESS("1000025007", "删除banner成功"),
    BANNER_SELECT_ERR("1000025008", "查询banner类型列表失败"),
    /*******************************************************************/
    /***********************Banner管理1000026XXX  ********************/
    /*******************************************************************/
    VIDEO_NO_ERR("1000026001", "没有视频"),
    VIDEO_ADD_SUCCESS("1000026002", "添加视频成功"),
    VIDEO_ADD_ERR("1000026003", "添加视频失败"),
    VIDEO_UPDATE_ERR("1000026004", "更新视频失败"),
    VIDEO_UPDATE_SUCCESS("1000026005", "更新视频成功"),
    VIDEO_DEL_ERR("1000026006", "删除视频失败"),
    VIDEO_DEL_SUCCESS("1000026007", "删除视频成功"),
    VIDEO_SELECT_ERR("1000026008", "查询视频类型列表失败"),
    /*******************************************************************/
    /***********************Pdf管理1000027XXX  ********************/
    /*******************************************************************/
    PDF_NO_ERR("1000027001", "没有PDF"),
    PDF_ADD_SUCCESS("1000027002", "添加PDF成功"),
    PDF_ADD_ERR("1000027003", "添加PDF失败"),
    PDF_UPDATE_ERR("1000027004", "更新PDF失败"),
    PDF_UPDATE_SUCCESS("1000027005", "更新PDF成功"),
    PDF_DEL_ERR("1000027006", "删除PDF失败"),
    PDF_DEL_SUCCESS("1000027007", "删除PDF成功"),
    PDF_SELECT_ERR("1000027008", "查询PDF类型列表失败"),
    /*******************************************************************/
    /***********************页面管理1000028XXX  ********************/
    /*******************************************************************/
    PAGE_NO_ERR("1000028001", "没有页面"),
    PAGE_ADD_SUCCESS("1000028002", "添加PAGE成功"),
    PAGE_ADD_ERR("1000028003", "添加页面失败"),
    PAGE_UPDATE_ERR("1000028004", "更新页面失败"),
    PAGE_UPDATE_SUCCESS("1000028005", "更新页面成功"),
    PAGE_DEL_ERR("1000028006", "删除页面失败"),
    PAGE_DEL_SUCCESS("1000028007", "删除页面成功"),
    PAGE_SELECT_ERR("1000028008", "查询页面列表失败");



    private String code;
    private String msg;

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

//    public String getMsg(String code) {
//
//    }

    CodeMessage(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "CodeMessage{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }

    public static CodeMessage getCodeMessage(String code) {
        for (CodeMessage codeMessage : CodeMessage.values()) {
            if (codeMessage.getCode().equals(code)) {
                return codeMessage;
            }
        }
        return null;
    }


}