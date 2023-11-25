package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.ChannelApi;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
@Deprecated
/* loaded from: classes3.dex */
public interface Channel extends Parcelable {

    /* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
    @Deprecated
    /* loaded from: classes3.dex */
    public interface GetInputStreamResult extends Releasable, Result {
        InputStream getInputStream();
    }

    /* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
    @Deprecated
    /* loaded from: classes3.dex */
    public interface GetOutputStreamResult extends Releasable, Result {
        OutputStream getOutputStream();
    }

    PendingResult<Status> addListener(GoogleApiClient googleApiClient, ChannelApi.ChannelListener channelListener);

    PendingResult<Status> close(GoogleApiClient googleApiClient);

    PendingResult<Status> close(GoogleApiClient googleApiClient, int i10);

    PendingResult<GetInputStreamResult> getInputStream(GoogleApiClient googleApiClient);

    String getNodeId();

    PendingResult<GetOutputStreamResult> getOutputStream(GoogleApiClient googleApiClient);

    String getPath();

    PendingResult<Status> receiveFile(GoogleApiClient googleApiClient, Uri uri, boolean z10);

    PendingResult<Status> removeListener(GoogleApiClient googleApiClient, ChannelApi.ChannelListener channelListener);

    PendingResult<Status> sendFile(GoogleApiClient googleApiClient, Uri uri);

    PendingResult<Status> sendFile(GoogleApiClient googleApiClient, Uri uri, long j10, long j11);
}
