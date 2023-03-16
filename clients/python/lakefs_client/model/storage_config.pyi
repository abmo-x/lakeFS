# coding: utf-8

"""
    lakeFS API

    lakeFS HTTP API  # noqa: E501

    The version of the OpenAPI document: 0.1.0
    Contact: services@treeverse.io
    Generated by: https://openapi-generator.tech
"""

from datetime import date, datetime  # noqa: F401
import decimal  # noqa: F401
import functools  # noqa: F401
import io  # noqa: F401
import re  # noqa: F401
import typing  # noqa: F401
import typing_extensions  # noqa: F401
import uuid  # noqa: F401

import frozendict  # noqa: F401

from lakefs_client import schemas  # noqa: F401


class StorageConfig(
    schemas.DictSchema
):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """


    class MetaOapg:
        required = {
            "blockstore_namespace_ValidityRegex",
            "blockstore_namespace_example",
            "blockstore_type",
            "import_support",
            "pre_sign_support",
        }
        
        class properties:
            blockstore_type = schemas.StrSchema
            blockstore_namespace_example = schemas.StrSchema
            blockstore_namespace_ValidityRegex = schemas.StrSchema
            pre_sign_support = schemas.BoolSchema
            import_support = schemas.BoolSchema
            default_namespace_prefix = schemas.StrSchema
            __annotations__ = {
                "blockstore_type": blockstore_type,
                "blockstore_namespace_example": blockstore_namespace_example,
                "blockstore_namespace_ValidityRegex": blockstore_namespace_ValidityRegex,
                "pre_sign_support": pre_sign_support,
                "import_support": import_support,
                "default_namespace_prefix": default_namespace_prefix,
            }
    
    blockstore_namespace_ValidityRegex: MetaOapg.properties.blockstore_namespace_ValidityRegex
    blockstore_namespace_example: MetaOapg.properties.blockstore_namespace_example
    blockstore_type: MetaOapg.properties.blockstore_type
    import_support: MetaOapg.properties.import_support
    pre_sign_support: MetaOapg.properties.pre_sign_support
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["blockstore_type"]) -> MetaOapg.properties.blockstore_type: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["blockstore_namespace_example"]) -> MetaOapg.properties.blockstore_namespace_example: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["blockstore_namespace_ValidityRegex"]) -> MetaOapg.properties.blockstore_namespace_ValidityRegex: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["pre_sign_support"]) -> MetaOapg.properties.pre_sign_support: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["import_support"]) -> MetaOapg.properties.import_support: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["default_namespace_prefix"]) -> MetaOapg.properties.default_namespace_prefix: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["blockstore_type", "blockstore_namespace_example", "blockstore_namespace_ValidityRegex", "pre_sign_support", "import_support", "default_namespace_prefix", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["blockstore_type"]) -> MetaOapg.properties.blockstore_type: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["blockstore_namespace_example"]) -> MetaOapg.properties.blockstore_namespace_example: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["blockstore_namespace_ValidityRegex"]) -> MetaOapg.properties.blockstore_namespace_ValidityRegex: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["pre_sign_support"]) -> MetaOapg.properties.pre_sign_support: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["import_support"]) -> MetaOapg.properties.import_support: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["default_namespace_prefix"]) -> typing.Union[MetaOapg.properties.default_namespace_prefix, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["blockstore_type", "blockstore_namespace_example", "blockstore_namespace_ValidityRegex", "pre_sign_support", "import_support", "default_namespace_prefix", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *_args: typing.Union[dict, frozendict.frozendict, ],
        blockstore_namespace_ValidityRegex: typing.Union[MetaOapg.properties.blockstore_namespace_ValidityRegex, str, ],
        blockstore_namespace_example: typing.Union[MetaOapg.properties.blockstore_namespace_example, str, ],
        blockstore_type: typing.Union[MetaOapg.properties.blockstore_type, str, ],
        import_support: typing.Union[MetaOapg.properties.import_support, bool, ],
        pre_sign_support: typing.Union[MetaOapg.properties.pre_sign_support, bool, ],
        default_namespace_prefix: typing.Union[MetaOapg.properties.default_namespace_prefix, str, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'StorageConfig':
        return super().__new__(
            cls,
            *_args,
            blockstore_namespace_ValidityRegex=blockstore_namespace_ValidityRegex,
            blockstore_namespace_example=blockstore_namespace_example,
            blockstore_type=blockstore_type,
            import_support=import_support,
            pre_sign_support=pre_sign_support,
            default_namespace_prefix=default_namespace_prefix,
            _configuration=_configuration,
            **kwargs,
        )
