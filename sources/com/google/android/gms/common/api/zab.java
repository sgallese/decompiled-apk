package com.google.android.gms.common.api;

import com.google.android.gms.common.api.PendingResult;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zab implements PendingResult.StatusListener {
    final /* synthetic */ Batch zaa;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zab(Batch batch) {
        this.zaa = batch;
    }

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    public final void onComplete(Status status) {
        Object obj;
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        Status status2;
        PendingResult[] pendingResultArr;
        obj = this.zaa.zai;
        synchronized (obj) {
            if (this.zaa.isCanceled()) {
                return;
            }
            if (status.isCanceled()) {
                this.zaa.zag = true;
            } else if (!status.isSuccess()) {
                this.zaa.zaf = true;
            }
            Batch batch = this.zaa;
            i10 = batch.zae;
            batch.zae = i10 - 1;
            Batch batch2 = this.zaa;
            i11 = batch2.zae;
            if (i11 == 0) {
                z10 = batch2.zag;
                if (z10) {
                    super/*com.google.android.gms.common.api.internal.BasePendingResult*/.cancel();
                } else {
                    z11 = batch2.zaf;
                    if (z11) {
                        status2 = new Status(13);
                    } else {
                        status2 = Status.RESULT_SUCCESS;
                    }
                    Batch batch3 = this.zaa;
                    pendingResultArr = batch3.zah;
                    batch3.setResult(new BatchResult(status2, pendingResultArr));
                }
            }
        }
    }
}
