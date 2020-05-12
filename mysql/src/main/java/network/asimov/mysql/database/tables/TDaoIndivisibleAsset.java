/*
 * This file is generated by jOOQ.
 */
package network.asimov.mysql.database.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import network.asimov.mysql.database.AsimovServer;
import network.asimov.mysql.database.Indexes;
import network.asimov.mysql.database.Keys;
import network.asimov.mysql.database.tables.records.TDaoIndivisibleAssetRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.12"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TDaoIndivisibleAsset extends TableImpl<TDaoIndivisibleAssetRecord> {

    private static final long serialVersionUID = -1690390127;

    /**
     * The reference instance of <code>asimov_server.t_dao_indivisible_asset</code>
     */
    public static final TDaoIndivisibleAsset T_DAO_INDIVISIBLE_ASSET = new TDaoIndivisibleAsset();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TDaoIndivisibleAssetRecord> getRecordType() {
        return TDaoIndivisibleAssetRecord.class;
    }

    /**
     * The column <code>asimov_server.t_dao_indivisible_asset.id</code>. 主键
     */
    public final TableField<TDaoIndivisibleAssetRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "主键");

    /**
     * The column <code>asimov_server.t_dao_indivisible_asset.tx_hash</code>. Transaction Hash
     */
    public final TableField<TDaoIndivisibleAssetRecord, String> TX_HASH = createField("tx_hash", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "Transaction Hash");

    /**
     * The column <code>asimov_server.t_dao_indivisible_asset.contract_address</code>. 组织合约地址
     */
    public final TableField<TDaoIndivisibleAssetRecord, String> CONTRACT_ADDRESS = createField("contract_address", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "组织合约地址");

    /**
     * The column <code>asimov_server.t_dao_indivisible_asset.asset</code>. 资产ID
     */
    public final TableField<TDaoIndivisibleAssetRecord, String> ASSET = createField("asset", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "资产ID");

    /**
     * The column <code>asimov_server.t_dao_indivisible_asset.voucher_id</code>. 资产编号
     */
    public final TableField<TDaoIndivisibleAssetRecord, Long> VOUCHER_ID = createField("voucher_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "资产编号");

    /**
     * The column <code>asimov_server.t_dao_indivisible_asset.asset_desc</code>. 资产描述
     */
    public final TableField<TDaoIndivisibleAssetRecord, String> ASSET_DESC = createField("asset_desc", org.jooq.impl.SQLDataType.VARCHAR(256).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "资产描述");

    /**
     * The column <code>asimov_server.t_dao_indivisible_asset.asset_status</code>. 资产状态，0-初始化，待投票通过，1-发行成功，2-发行失败
     */
    public final TableField<TDaoIndivisibleAssetRecord, Byte> ASSET_STATUS = createField("asset_status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "资产状态，0-初始化，待投票通过，1-发行成功，2-发行失败");

    /**
     * The column <code>asimov_server.t_dao_indivisible_asset.create_time</code>. 创建时间
     */
    public final TableField<TDaoIndivisibleAssetRecord, Long> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "创建时间");

    /**
     * The column <code>asimov_server.t_dao_indivisible_asset.update_time</code>. 更新时间
     */
    public final TableField<TDaoIndivisibleAssetRecord, Long> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "更新时间");

    /**
     * Create a <code>asimov_server.t_dao_indivisible_asset</code> table reference
     */
    public TDaoIndivisibleAsset() {
        this(DSL.name("t_dao_indivisible_asset"), null);
    }

    /**
     * Create an aliased <code>asimov_server.t_dao_indivisible_asset</code> table reference
     */
    public TDaoIndivisibleAsset(String alias) {
        this(DSL.name(alias), T_DAO_INDIVISIBLE_ASSET);
    }

    /**
     * Create an aliased <code>asimov_server.t_dao_indivisible_asset</code> table reference
     */
    public TDaoIndivisibleAsset(Name alias) {
        this(alias, T_DAO_INDIVISIBLE_ASSET);
    }

    private TDaoIndivisibleAsset(Name alias, Table<TDaoIndivisibleAssetRecord> aliased) {
        this(alias, aliased, null);
    }

    private TDaoIndivisibleAsset(Name alias, Table<TDaoIndivisibleAssetRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TDaoIndivisibleAsset(Table<O> child, ForeignKey<O, TDaoIndivisibleAssetRecord> key) {
        super(child, key, T_DAO_INDIVISIBLE_ASSET);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return AsimovServer.ASIMOV_SERVER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.T_DAO_INDIVISIBLE_ASSET_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TDaoIndivisibleAssetRecord> getPrimaryKey() {
        return Keys.KEY_T_DAO_INDIVISIBLE_ASSET_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TDaoIndivisibleAssetRecord>> getKeys() {
        return Arrays.<UniqueKey<TDaoIndivisibleAssetRecord>>asList(Keys.KEY_T_DAO_INDIVISIBLE_ASSET_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDaoIndivisibleAsset as(String alias) {
        return new TDaoIndivisibleAsset(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDaoIndivisibleAsset as(Name alias) {
        return new TDaoIndivisibleAsset(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TDaoIndivisibleAsset rename(String name) {
        return new TDaoIndivisibleAsset(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TDaoIndivisibleAsset rename(Name name) {
        return new TDaoIndivisibleAsset(name, null);
    }
}
