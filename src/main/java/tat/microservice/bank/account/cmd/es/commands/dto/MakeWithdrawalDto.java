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
package tat.microservice.bank.account.cmd.es.commands.dto;


public class MakeWithdrawalDto {

	public MakeWithdrawalDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	//private String accountId;
	private double amount;

	public MakeWithdrawalDto(String accountId, double amount) {
		super();
		//this.accountId = accountId;
		this.amount = amount;
	}

	/*
	 * public String getAccountId() { return accountId; }
	 * 
	 * public void setAccountId(String accountId) { this.accountId = accountId; }
	 */

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "WithdrawalDto [amount=" + amount + "]";
	}

}
