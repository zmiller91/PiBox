{
    "name": "PiBox",
    "packageName": "com.zm.pibox",

    "configuration": {
        "channels": {
            "test": "test",
            "prod": "prod"
        },
        "hosts": {
            "test": "localhost",
            "prod": "localhost"
        }
    },

    "api": {
        "methods": [
            {
                "name": "putLightSchedule",
                "result": "LightSchedule",
                "params": [
                    {
                        "name": "configuration",
                        "ref": "Configuration"
                    }
                ],
                "throwables": ["TestException", "IOException"]
            },
            {
                "name": "voidResponse",
                "params": [
                    {
                        "name": "configuration",
                        "ref": "Configuration"
                        }
                ]
            },
            {
                "name": "intResponse",
                "result": "IntResponse",
                "params": [
                    {
                        "name": "configuration",
                        "ref": "Configuration"
                    }
                ]
            },
            {
                "name": "multipleParams",
                "result": "IntResponse",
                "params": [
                    {
                        "name": "configuration",
                        "ref": "Configuration"
                    },
                    {
                        "name": "str",
                        "ref": "string"
                    }
                ]
            },
            {
                "name": "noParams",
                "result": "MapResponse",
                "params": []
            }
        ]
    },

    "models": [
        {
            "name": "GeneralResponse",
            "properties": [
                {
                    "name": "status",
                    "ref": "int"
                }
            ]
        },
        {
            "name": "Configuration",
            "properties": [
                {
                    "name": "light",
                    "ref": "Light"
                }
            ]
        },
        {
            "name": "Light",
            "properties": [
                {
                    "name": "on",
                    "ref": "long"
                },
                {
                    "name": "off",
                    "ref": "long"
                }
            ]
        },
        {
            "name": "MapResponse",
            "properties": [
                {
                    "name": "val",
                    "ref": "array"
                }
            ]
        },
        {
            "name": "IntResponse",
            "properties": [
                {
                    "name": "val",
                    "ref": "int"
                }
            ]
        },
        {
            "name": "string",
            "javaType": "String"
        },
        {
            "name": "long",
            "javaType": "long"
        },
        {
            "name": "int",
            "javaType": "Integer"
        },
        {
            "name": "array",
            "javaType": "List<Map<Integer, Boolean>>",
            "javaClass": "java.util.List",
            "imports": ["java.util.Map"]
        }],

    "exceptions": [
        {
            "name": "TestException",
            "properties": [
                {
                    "name": "message",
                    "ref": "string"
                }
            ]
        },
        {
            "name": "IOException",
            "javaType": "IOException",
            "javaClass": "java.io.IOException"
        }]

}