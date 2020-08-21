package migrations;

import com.google.common.collect.ImmutableList;

import lombok.experimental.UtilityClass;
import migrations.timescaledb.AddCostEvents;
import migrations.timescaledb.AddDeploymentTagsToDeployment;
import migrations.timescaledb.AddFieldsToServiceGuardStats;
import migrations.timescaledb.AddFieldsToWorkflowCVMetrics;
import migrations.timescaledb.AddIdleUnallocatedColumns;
import migrations.timescaledb.AddIndexToInstanceV2Migration;
import migrations.timescaledb.AddIndicesForCostEvents;
import migrations.timescaledb.AddInstancesDeployedToDeployment;
import migrations.timescaledb.AddMaxUtilColumns;
import migrations.timescaledb.AddPercentagesToCostEvents;
import migrations.timescaledb.AddRequestColumnToBillingData;
import migrations.timescaledb.AddRollbackToDeployment;
import migrations.timescaledb.AddSchemaForServiceGuardStats;
import migrations.timescaledb.AddSystemCostBillingData;
import migrations.timescaledb.AddingToCVDeploymentMetrics;
import migrations.timescaledb.AlterCEUtilizationDataTables;
import migrations.timescaledb.ChangeToTimeStampTZ;
import migrations.timescaledb.CreateBillingData;
import migrations.timescaledb.CreateBillingDataHourly;
import migrations.timescaledb.CreateKubernetesUtilizationData;
import migrations.timescaledb.CreateNewInstanceV2Migration;
import migrations.timescaledb.CreateUtilizationData;
import migrations.timescaledb.DeploymentAdditionalColumns;
import migrations.timescaledb.DeploymentChange;
import migrations.timescaledb.InitSchemaMigration;
import migrations.timescaledb.InitVerificationSchemaMigration;
import migrations.timescaledb.RenameInstanceMigration;
import migrations.timescaledb.UniqueIndexCEUtilizationDataTables;
import migrations.timescaledb.UpdateServiceGuardSchema;
import org.apache.commons.lang3.tuple.Pair;

import java.util.List;

@UtilityClass
public class TimescaleDBMigrationListTest {
  public static List<Pair<Integer, Class<? extends TimeScaleDBMigration>>> getMigrations() {
    return new ImmutableList.Builder<Pair<Integer, Class<? extends TimeScaleDBMigration>>>()
        .add(Pair.of(1, InitSchemaMigration.class))
        .add(Pair.of(2, InitVerificationSchemaMigration.class))
        .add(Pair.of(3, RenameInstanceMigration.class))
        .add(Pair.of(4, DeploymentChange.class))
        .add(Pair.of(5, DeploymentAdditionalColumns.class))
        .add(Pair.of(6, ChangeToTimeStampTZ.class))
        .add(Pair.of(7, CreateNewInstanceV2Migration.class))
        .add(Pair.of(8, AddIndexToInstanceV2Migration.class))
        .add(Pair.of(9, AddRollbackToDeployment.class))
        .add(Pair.of(10, AddingToCVDeploymentMetrics.class))
        .add(Pair.of(11, AddSchemaForServiceGuardStats.class))
        .add(Pair.of(12, AddInstancesDeployedToDeployment.class))
        .add(Pair.of(13, UpdateServiceGuardSchema.class))
        .add(Pair.of(14, AddFieldsToWorkflowCVMetrics.class))
        .add(Pair.of(15, AddFieldsToServiceGuardStats.class))
        .add(Pair.of(16, CreateBillingData.class))
        .add(Pair.of(17, CreateKubernetesUtilizationData.class))
        .add(Pair.of(18, CreateUtilizationData.class))
        .add(Pair.of(19, AlterCEUtilizationDataTables.class))
        .add(Pair.of(20, UniqueIndexCEUtilizationDataTables.class))
        .add(Pair.of(21, AddSystemCostBillingData.class))
        .add(Pair.of(22, AddCostEvents.class))
        .add(Pair.of(23, AddDeploymentTagsToDeployment.class))
        .add(Pair.of(24, AddIdleUnallocatedColumns.class))
        .add(Pair.of(25, AddMaxUtilColumns.class))
        .add(Pair.of(26, CreateBillingDataHourly.class))
        .add(Pair.of(27, AddRequestColumnToBillingData.class))
        .add(Pair.of(28, AddPercentagesToCostEvents.class))
        .add(Pair.of(29, AddIndicesForCostEvents.class))
        .build();
  }
}
