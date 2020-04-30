/*
 * This file is generated by jOOQ.
 */
package network.asimov.mysql.database;


import javax.annotation.Generated;

import network.asimov.mysql.database.tables.TChainNode;
import network.asimov.mysql.database.tables.TDaoAccount;
import network.asimov.mysql.database.tables.TDaoAsset;
import network.asimov.mysql.database.tables.TDaoIndivisibleAsset;
import network.asimov.mysql.database.tables.TDaoMessage;
import network.asimov.mysql.database.tables.TDaoOperation;
import network.asimov.mysql.database.tables.TDaoOrganization;
import network.asimov.mysql.database.tables.TFoundationOperation;
import network.asimov.mysql.database.tables.TMinerOperation;
import network.asimov.mysql.database.tables.TRollback;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>asimov_server</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.12"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index T_CHAIN_NODE_INDEX_IP = Indexes0.T_CHAIN_NODE_INDEX_IP;
    public static final Index T_CHAIN_NODE_PRIMARY = Indexes0.T_CHAIN_NODE_PRIMARY;
    public static final Index T_DAO_ACCOUNT_PRIMARY = Indexes0.T_DAO_ACCOUNT_PRIMARY;
    public static final Index T_DAO_ACCOUNT_T_ACCOUNT_ADDRESS_UNIQUE = Indexes0.T_DAO_ACCOUNT_T_ACCOUNT_ADDRESS_UNIQUE;
    public static final Index T_DAO_ASSET_PRIMARY = Indexes0.T_DAO_ASSET_PRIMARY;
    public static final Index T_DAO_INDIVISIBLE_ASSET_PRIMARY = Indexes0.T_DAO_INDIVISIBLE_ASSET_PRIMARY;
    public static final Index T_DAO_MESSAGE_PRIMARY = Indexes0.T_DAO_MESSAGE_PRIMARY;
    public static final Index T_DAO_OPERATION_INDEX_CONTRACT_ADDRESS = Indexes0.T_DAO_OPERATION_INDEX_CONTRACT_ADDRESS;
    public static final Index T_DAO_OPERATION_INDEX_OPERATION_TYPE = Indexes0.T_DAO_OPERATION_INDEX_OPERATION_TYPE;
    public static final Index T_DAO_OPERATION_INDEX_OPERATOR_TYPE = Indexes0.T_DAO_OPERATION_INDEX_OPERATOR_TYPE;
    public static final Index T_DAO_OPERATION_PRIMARY = Indexes0.T_DAO_OPERATION_PRIMARY;
    public static final Index T_DAO_ORGANIZATION_PRIMARY = Indexes0.T_DAO_ORGANIZATION_PRIMARY;
    public static final Index T_DAO_ORGANIZATION_T_ORGANIZATION_IDX_3 = Indexes0.T_DAO_ORGANIZATION_T_ORGANIZATION_IDX_3;
    public static final Index T_FOUNDATION_OPERATION_INDEX_OPERATION_TYPE = Indexes0.T_FOUNDATION_OPERATION_INDEX_OPERATION_TYPE;
    public static final Index T_FOUNDATION_OPERATION_INDEX_OPERATOR_TYPE = Indexes0.T_FOUNDATION_OPERATION_INDEX_OPERATOR_TYPE;
    public static final Index T_FOUNDATION_OPERATION_INDEX_TX_HASH_UNIQUE = Indexes0.T_FOUNDATION_OPERATION_INDEX_TX_HASH_UNIQUE;
    public static final Index T_FOUNDATION_OPERATION_PRIMARY = Indexes0.T_FOUNDATION_OPERATION_PRIMARY;
    public static final Index T_MINER_OPERATION_INDEX_OPERATION_TYPE = Indexes0.T_MINER_OPERATION_INDEX_OPERATION_TYPE;
    public static final Index T_MINER_OPERATION_INDEX_OPERATOR_TYPE = Indexes0.T_MINER_OPERATION_INDEX_OPERATOR_TYPE;
    public static final Index T_MINER_OPERATION_INDEX_ROUND_OPERATOR_TYPE = Indexes0.T_MINER_OPERATION_INDEX_ROUND_OPERATOR_TYPE;
    public static final Index T_MINER_OPERATION_INDEX_TX_HASH_UNIQUE = Indexes0.T_MINER_OPERATION_INDEX_TX_HASH_UNIQUE;
    public static final Index T_MINER_OPERATION_PRIMARY = Indexes0.T_MINER_OPERATION_PRIMARY;
    public static final Index T_ROLLBACK_INDEX_HEIGHT = Indexes0.T_ROLLBACK_INDEX_HEIGHT;
    public static final Index T_ROLLBACK_PRIMARY = Indexes0.T_ROLLBACK_PRIMARY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index T_CHAIN_NODE_INDEX_IP = Internal.createIndex("INDEX_IP", TChainNode.T_CHAIN_NODE, new OrderField[] { TChainNode.T_CHAIN_NODE.IP }, false);
        public static Index T_CHAIN_NODE_PRIMARY = Internal.createIndex("PRIMARY", TChainNode.T_CHAIN_NODE, new OrderField[] { TChainNode.T_CHAIN_NODE.ID }, true);
        public static Index T_DAO_ACCOUNT_PRIMARY = Internal.createIndex("PRIMARY", TDaoAccount.T_DAO_ACCOUNT, new OrderField[] { TDaoAccount.T_DAO_ACCOUNT.ID }, true);
        public static Index T_DAO_ACCOUNT_T_ACCOUNT_ADDRESS_UNIQUE = Internal.createIndex("t_account_address_unique", TDaoAccount.T_DAO_ACCOUNT, new OrderField[] { TDaoAccount.T_DAO_ACCOUNT.ADDRESS }, true);
        public static Index T_DAO_ASSET_PRIMARY = Internal.createIndex("PRIMARY", TDaoAsset.T_DAO_ASSET, new OrderField[] { TDaoAsset.T_DAO_ASSET.ID }, true);
        public static Index T_DAO_INDIVISIBLE_ASSET_PRIMARY = Internal.createIndex("PRIMARY", TDaoIndivisibleAsset.T_DAO_INDIVISIBLE_ASSET, new OrderField[] { TDaoIndivisibleAsset.T_DAO_INDIVISIBLE_ASSET.ID }, true);
        public static Index T_DAO_MESSAGE_PRIMARY = Internal.createIndex("PRIMARY", TDaoMessage.T_DAO_MESSAGE, new OrderField[] { TDaoMessage.T_DAO_MESSAGE.ID }, true);
        public static Index T_DAO_OPERATION_INDEX_CONTRACT_ADDRESS = Internal.createIndex("INDEX_CONTRACT_ADDRESS", TDaoOperation.T_DAO_OPERATION, new OrderField[] { TDaoOperation.T_DAO_OPERATION.CONTRACT_ADDRESS }, false);
        public static Index T_DAO_OPERATION_INDEX_OPERATION_TYPE = Internal.createIndex("INDEX_OPERATION_TYPE", TDaoOperation.T_DAO_OPERATION, new OrderField[] { TDaoOperation.T_DAO_OPERATION.OPERATION_TYPE }, false);
        public static Index T_DAO_OPERATION_INDEX_OPERATOR_TYPE = Internal.createIndex("INDEX_OPERATOR_TYPE", TDaoOperation.T_DAO_OPERATION, new OrderField[] { TDaoOperation.T_DAO_OPERATION.OPERATOR, TDaoOperation.T_DAO_OPERATION.OPERATION_TYPE }, false);
        public static Index T_DAO_OPERATION_PRIMARY = Internal.createIndex("PRIMARY", TDaoOperation.T_DAO_OPERATION, new OrderField[] { TDaoOperation.T_DAO_OPERATION.ID }, true);
        public static Index T_DAO_ORGANIZATION_PRIMARY = Internal.createIndex("PRIMARY", TDaoOrganization.T_DAO_ORGANIZATION, new OrderField[] { TDaoOrganization.T_DAO_ORGANIZATION.ID }, true);
        public static Index T_DAO_ORGANIZATION_T_ORGANIZATION_IDX_3 = Internal.createIndex("t_organization_idx_3", TDaoOrganization.T_DAO_ORGANIZATION, new OrderField[] { TDaoOrganization.T_DAO_ORGANIZATION.CREATOR_ADDRESS }, false);
        public static Index T_FOUNDATION_OPERATION_INDEX_OPERATION_TYPE = Internal.createIndex("INDEX_OPERATION_TYPE", TFoundationOperation.T_FOUNDATION_OPERATION, new OrderField[] { TFoundationOperation.T_FOUNDATION_OPERATION.OPERATION_TYPE }, false);
        public static Index T_FOUNDATION_OPERATION_INDEX_OPERATOR_TYPE = Internal.createIndex("INDEX_OPERATOR_TYPE", TFoundationOperation.T_FOUNDATION_OPERATION, new OrderField[] { TFoundationOperation.T_FOUNDATION_OPERATION.OPERATOR, TFoundationOperation.T_FOUNDATION_OPERATION.OPERATION_TYPE }, false);
        public static Index T_FOUNDATION_OPERATION_INDEX_TX_HASH_UNIQUE = Internal.createIndex("INDEX_TX_HASH_UNIQUE", TFoundationOperation.T_FOUNDATION_OPERATION, new OrderField[] { TFoundationOperation.T_FOUNDATION_OPERATION.TX_HASH }, true);
        public static Index T_FOUNDATION_OPERATION_PRIMARY = Internal.createIndex("PRIMARY", TFoundationOperation.T_FOUNDATION_OPERATION, new OrderField[] { TFoundationOperation.T_FOUNDATION_OPERATION.ID }, true);
        public static Index T_MINER_OPERATION_INDEX_OPERATION_TYPE = Internal.createIndex("INDEX_OPERATION_TYPE", TMinerOperation.T_MINER_OPERATION, new OrderField[] { TMinerOperation.T_MINER_OPERATION.OPERATION_TYPE }, false);
        public static Index T_MINER_OPERATION_INDEX_OPERATOR_TYPE = Internal.createIndex("INDEX_OPERATOR_TYPE", TMinerOperation.T_MINER_OPERATION, new OrderField[] { TMinerOperation.T_MINER_OPERATION.OPERATOR, TMinerOperation.T_MINER_OPERATION.OPERATION_TYPE }, false);
        public static Index T_MINER_OPERATION_INDEX_ROUND_OPERATOR_TYPE = Internal.createIndex("INDEX_ROUND_OPERATOR_TYPE", TMinerOperation.T_MINER_OPERATION, new OrderField[] { TMinerOperation.T_MINER_OPERATION.ROUND, TMinerOperation.T_MINER_OPERATION.OPERATOR, TMinerOperation.T_MINER_OPERATION.OPERATION_TYPE }, false);
        public static Index T_MINER_OPERATION_INDEX_TX_HASH_UNIQUE = Internal.createIndex("INDEX_TX_HASH_UNIQUE", TMinerOperation.T_MINER_OPERATION, new OrderField[] { TMinerOperation.T_MINER_OPERATION.TX_HASH }, true);
        public static Index T_MINER_OPERATION_PRIMARY = Internal.createIndex("PRIMARY", TMinerOperation.T_MINER_OPERATION, new OrderField[] { TMinerOperation.T_MINER_OPERATION.ID }, true);
        public static Index T_ROLLBACK_INDEX_HEIGHT = Internal.createIndex("INDEX_HEIGHT", TRollback.T_ROLLBACK, new OrderField[] { TRollback.T_ROLLBACK.HEIGHT }, false);
        public static Index T_ROLLBACK_PRIMARY = Internal.createIndex("PRIMARY", TRollback.T_ROLLBACK, new OrderField[] { TRollback.T_ROLLBACK.ID }, true);
    }
}
