/*##############################################################################
# Copyright 2021 IBM Corp. All Rights Reserved.
#
#  Licensed under the Apache License, Version 2.0 (the "License");
#  you may not use this file except in compliance with the License.
#  You may obtain a copy of the License at
#
#       http://www.apache.org/licenses/LICENSE-2.0
#
#   Unless required by applicable law or agreed to in writing, software
#   distributed under the License is distributed on an "AS IS" BASIS,
#   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
#   See the License for the specific language governing permissions and
#   limitations under the License.
##############################################################################*/
package tat.microservice.bank.account.query.es.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import antlr.collections.List;
import tat.microservice.bank.account.query.es.entities.AccountTransferQueryEntity;


public interface AccountTransferRepository extends JpaRepository<AccountTransferQueryEntity, String> {

	AccountTransferQueryEntity findOneByTransferId(String transferId);
	//Iterable<AccountTransferQueryEntity> findAllTransfer();
	Iterable<AccountTransferQueryEntity>findAllByOrderByTransferIdAsc();
	  AccountTransferQueryEntity findTransferById(String id);

	//Iterable<AccountTransferQueryEntity>findBySourceAccountIdOrDestinationAccountId(String sourceAccountId, String destinationAccountId);
	  Iterable<AccountTransferQueryEntity>findByFromAccountIdOrToAccountId(String fromAccountId, String toAccountId);
}
