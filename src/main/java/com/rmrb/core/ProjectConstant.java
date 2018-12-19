package com.rmrb.core;

/**
 * 项目常量
 */
public final class ProjectConstant {

    public static final String BASE_PACKAGE = "com.rmrb";//生成代码所在的基础包名称，可根据自己公司的项目修改（注意：这个配置修改之后需要手工修改src目录项目默认的包路径，使其保持一致，不然会找不到类）

    public static final String BASE_PACKAGE_GENERATE = "com.rmrb.user";//生成代码所在的基础包名称，可根据自己公司的项目修改（注意：这个配置修改之后需要手工修改src目录项目默认的包路径，使其保持一致，不然会找不到类）

    public static final String MODEL_PACKAGE = BASE_PACKAGE_GENERATE + ".model";//生成的Model所在包
    public static final String MAPPER_PACKAGE = BASE_PACKAGE_GENERATE + ".dao";//生成的Mapper所在包
    public static final String SERVICE_PACKAGE = BASE_PACKAGE_GENERATE + ".service";//生成的Service所在包
    public static final String SERVICE_IMPL_PACKAGE = BASE_PACKAGE_GENERATE + ".service.impl";//生成的ServiceImpl所在包
    public static final String CONTROLLER_PACKAGE = BASE_PACKAGE_GENERATE + ".web";//生成的Controller所在包

    public static final String MAPPER_INTERFACE_REFERENCE = BASE_PACKAGE + ".core.Mapper";//Mapper插件基础接口的完全限定名

}
