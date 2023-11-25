package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
@Deprecated
/* loaded from: classes3.dex */
public interface DataApi {
    public static final String ACTION_DATA_CHANGED = "com.google.android.gms.wearable.DATA_CHANGED";
    public static final int FILTER_LITERAL = 0;
    public static final int FILTER_PREFIX = 1;

    /* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
    @Deprecated
    /* loaded from: classes3.dex */
    public interface DataItemResult extends Result {
        DataItem getDataItem();
    }

    /* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
    @Deprecated
    /* loaded from: classes3.dex */
    public interface DataListener {
        void onDataChanged(DataEventBuffer dataEventBuffer);
    }

    /* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
    @Deprecated
    /* loaded from: classes3.dex */
    public interface DeleteDataItemsResult extends Result {
        int getNumDeleted();
    }

    /* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface FilterType {
    }

    /* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
    @Deprecated
    /* loaded from: classes3.dex */
    public interface GetFdForAssetResult extends Result, Releasable {
        ParcelFileDescriptor getFd();

        InputStream getInputStream();
    }

    PendingResult<Status> addListener(GoogleApiClient googleApiClient, DataListener dataListener);

    PendingResult<Status> addListener(GoogleApiClient googleApiClient, DataListener dataListener, Uri uri, int i10);

    PendingResult<DeleteDataItemsResult> deleteDataItems(GoogleApiClient googleApiClient, Uri uri);

    PendingResult<DeleteDataItemsResult> deleteDataItems(GoogleApiClient googleApiClient, Uri uri, int i10);

    PendingResult<DataItemResult> getDataItem(GoogleApiClient googleApiClient, Uri uri);

    PendingResult<DataItemBuffer> getDataItems(GoogleApiClient googleApiClient);

    PendingResult<DataItemBuffer> getDataItems(GoogleApiClient googleApiClient, Uri uri);

    PendingResult<DataItemBuffer> getDataItems(GoogleApiClient googleApiClient, Uri uri, int i10);

    PendingResult<GetFdForAssetResult> getFdForAsset(GoogleApiClient googleApiClient, Asset asset);

    PendingResult<GetFdForAssetResult> getFdForAsset(GoogleApiClient googleApiClient, DataItemAsset dataItemAsset);

    PendingResult<DataItemResult> putDataItem(GoogleApiClient googleApiClient, PutDataRequest putDataRequest);

    PendingResult<Status> removeListener(GoogleApiClient googleApiClient, DataListener dataListener);
}
