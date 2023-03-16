# coding: utf-8

"""


    Generated by: https://openapi-generator.tech
"""

import unittest
from unittest.mock import patch

import urllib3

import lakefs_client
from lakefs_client.paths.auth_password import post  # noqa: E501
from lakefs_client import configuration, schemas, api_client

from .. import ApiTestMixin


class TestAuthPassword(ApiTestMixin, unittest.TestCase):
    """
    AuthPassword unit test stubs
        Update user password by reset_password token  # noqa: E501
    """
    _configuration = configuration.Configuration()

    def setUp(self):
        used_api_client = api_client.ApiClient(configuration=self._configuration)
        self.api = post.ApiForpost(api_client=used_api_client)  # noqa: E501

    def tearDown(self):
        pass

    response_status = 201
    response_body = ''




if __name__ == '__main__':
    unittest.main()
