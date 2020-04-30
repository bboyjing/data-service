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
import network.asimov.mysql.database.tables.records.TChainNodeRecord;
import network.asimov.mysql.database.tables.records.TDaoAccountRecord;
import network.asimov.mysql.database.tables.records.TDaoAssetRecord;
import network.asimov.mysql.database.tables.records.TDaoIndivisibleAssetRecord;
import network.asimov.mysql.database.tables.records.TDaoMessageRecord;
import network.asimov.mysql.database.tables.records.TDaoOperationRecord;
import network.asimov.mysql.database.tables.records.TDaoOrganizationRecord;
import network.asimov.mysql.database.tables.records.TFoundationOperationRecord;
import network.asimov.mysql.database.tables.records.TMinerOperationRecord;
import network.asimov.mysql.database.tables.records.TRollbackRecord;

import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>asimov_server</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.12"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<TChainNodeRecord> KEY_T_CHAIN_NODE_PRIMARY = UniqueKeys0.KEY_T_CHAIN_NODE_PRIMARY;
    public static final UniqueKey<TDaoAccountRecord> KEY_T_DAO_ACCOUNT_PRIMARY = UniqueKeys0.KEY_T_DAO_ACCOUNT_PRIMARY;
    public static final UniqueKey<TDaoAccountRecord> KEY_T_DAO_ACCOUNT_T_ACCOUNT_ADDRESS_UNIQUE = UniqueKeys0.KEY_T_DAO_ACCOUNT_T_ACCOUNT_ADDRESS_UNIQUE;
    public static final UniqueKey<TDaoAssetRecord> KEY_T_DAO_ASSET_PRIMARY = UniqueKeys0.KEY_T_DAO_ASSET_PRIMARY;
    public static final UniqueKey<TDaoIndivisibleAssetRecord> KEY_T_DAO_INDIVISIBLE_ASSET_PRIMARY = UniqueKeys0.KEY_T_DAO_INDIVISIBLE_ASSET_PRIMARY;
    public static final UniqueKey<TDaoMessageRecord> KEY_T_DAO_MESSAGE_PRIMARY = UniqueKeys0.KEY_T_DAO_MESSAGE_PRIMARY;
    public static final UniqueKey<TDaoOperationRecord> KEY_T_DAO_OPERATION_PRIMARY = UniqueKeys0.KEY_T_DAO_OPERATION_PRIMARY;
    public static final UniqueKey<TDaoOrganizationRecord> KEY_T_DAO_ORGANIZATION_PRIMARY = UniqueKeys0.KEY_T_DAO_ORGANIZATION_PRIMARY;
    public static final UniqueKey<TFoundationOperationRecord> KEY_T_FOUNDATION_OPERATION_PRIMARY = UniqueKeys0.KEY_T_FOUNDATION_OPERATION_PRIMARY;
    public static final UniqueKey<TFoundationOperationRecord> KEY_T_FOUNDATION_OPERATION_INDEX_TX_HASH_UNIQUE = UniqueKeys0.KEY_T_FOUNDATION_OPERATION_INDEX_TX_HASH_UNIQUE;
    public static final UniqueKey<TMinerOperationRecord> KEY_T_MINER_OPERATION_PRIMARY = UniqueKeys0.KEY_T_MINER_OPERATION_PRIMARY;
    public static final UniqueKey<TMinerOperationRecord> KEY_T_MINER_OPERATION_INDEX_TX_HASH_UNIQUE = UniqueKeys0.KEY_T_MINER_OPERATION_INDEX_TX_HASH_UNIQUE;
    public static final UniqueKey<TRollbackRecord> KEY_T_ROLLBACK_PRIMARY = UniqueKeys0.KEY_T_ROLLBACK_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class UniqueKeys0 {
        public static final UniqueKey<TChainNodeRecord> KEY_T_CHAIN_NODE_PRIMARY = Internal.createUniqueKey(TChainNode.T_CHAIN_NODE, "KEY_t_chain_node_PRIMARY", TChainNode.T_CHAIN_NODE.ID);
        public static final UniqueKey<TDaoAccountRecord> KEY_T_DAO_ACCOUNT_PRIMARY = Internal.createUniqueKey(TDaoAccount.T_DAO_ACCOUNT, "KEY_t_dao_account_PRIMARY", TDaoAccount.T_DAO_ACCOUNT.ID);
        public static final UniqueKey<TDaoAccountRecord> KEY_T_DAO_ACCOUNT_T_ACCOUNT_ADDRESS_UNIQUE = Internal.createUniqueKey(TDaoAccount.T_DAO_ACCOUNT, "KEY_t_dao_account_t_account_address_unique", TDaoAccount.T_DAO_ACCOUNT.ADDRESS);
        public static final UniqueKey<TDaoAssetRecord> KEY_T_DAO_ASSET_PRIMARY = Internal.createUniqueKey(TDaoAsset.T_DAO_ASSET, "KEY_t_dao_asset_PRIMARY", TDaoAsset.T_DAO_ASSET.ID);
        public static final UniqueKey<TDaoIndivisibleAssetRecord> KEY_T_DAO_INDIVISIBLE_ASSET_PRIMARY = Internal.createUniqueKey(TDaoIndivisibleAsset.T_DAO_INDIVISIBLE_ASSET, "KEY_t_dao_indivisible_asset_PRIMARY", TDaoIndivisibleAsset.T_DAO_INDIVISIBLE_ASSET.ID);
        public static final UniqueKey<TDaoMessageRecord> KEY_T_DAO_MESSAGE_PRIMARY = Internal.createUniqueKey(TDaoMessage.T_DAO_MESSAGE, "KEY_t_dao_message_PRIMARY", TDaoMessage.T_DAO_MESSAGE.ID);
        public static final UniqueKey<TDaoOperationRecord> KEY_T_DAO_OPERATION_PRIMARY = Internal.createUniqueKey(TDaoOperation.T_DAO_OPERATION, "KEY_t_dao_operation_PRIMARY", TDaoOperation.T_DAO_OPERATION.ID);
        public static final UniqueKey<TDaoOrganizationRecord> KEY_T_DAO_ORGANIZATION_PRIMARY = Internal.createUniqueKey(TDaoOrganization.T_DAO_ORGANIZATION, "KEY_t_dao_organization_PRIMARY", TDaoOrganization.T_DAO_ORGANIZATION.ID);
        public static final UniqueKey<TFoundationOperationRecord> KEY_T_FOUNDATION_OPERATION_PRIMARY = Internal.createUniqueKey(TFoundationOperation.T_FOUNDATION_OPERATION, "KEY_t_foundation_operation_PRIMARY", TFoundationOperation.T_FOUNDATION_OPERATION.ID);
        public static final UniqueKey<TFoundationOperationRecord> KEY_T_FOUNDATION_OPERATION_INDEX_TX_HASH_UNIQUE = Internal.createUniqueKey(TFoundationOperation.T_FOUNDATION_OPERATION, "KEY_t_foundation_operation_INDEX_TX_HASH_UNIQUE", TFoundationOperation.T_FOUNDATION_OPERATION.TX_HASH);
        public static final UniqueKey<TMinerOperationRecord> KEY_T_MINER_OPERATION_PRIMARY = Internal.createUniqueKey(TMinerOperation.T_MINER_OPERATION, "KEY_t_miner_operation_PRIMARY", TMinerOperation.T_MINER_OPERATION.ID);
        public static final UniqueKey<TMinerOperationRecord> KEY_T_MINER_OPERATION_INDEX_TX_HASH_UNIQUE = Internal.createUniqueKey(TMinerOperation.T_MINER_OPERATION, "KEY_t_miner_operation_INDEX_TX_HASH_UNIQUE", TMinerOperation.T_MINER_OPERATION.TX_HASH);
        public static final UniqueKey<TRollbackRecord> KEY_T_ROLLBACK_PRIMARY = Internal.createUniqueKey(TRollback.T_ROLLBACK, "KEY_t_rollback_PRIMARY", TRollback.T_ROLLBACK.ID);
    }
}