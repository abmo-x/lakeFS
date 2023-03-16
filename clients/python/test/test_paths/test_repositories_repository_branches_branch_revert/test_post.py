# coding: utf-8

"""


    Generated by: https://openapi-generator.tech
"""

import unittest
from unittest.mock import patch

import urllib3

import lakefs_client
from lakefs_client.paths.repositories_repository_branches_branch_revert import post  # noqa: E501
from lakefs_client import configuration, schemas, api_client

from .. import ApiTestMixin


class TestRepositoriesRepositoryBranchesBranchRevert(ApiTestMixin, unittest.TestCase):
    """
    RepositoriesRepositoryBranchesBranchRevert unit test stubs
        revert  # noqa: E501
    """
    _configuration = configuration.Configuration()

    def setUp(self):
        used_api_client = api_client.ApiClient(configuration=self._configuration)
        self.api = post.ApiForpost(api_client=used_api_client)  # noqa: E501

    def tearDown(self):
        pass

    response_status = 204
    response_body = ''




if __name__ == '__main__':
    unittest.main()
