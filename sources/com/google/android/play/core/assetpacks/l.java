package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
final class l extends j {
    /* JADX INFO: Access modifiers changed from: package-private */
    public l(r rVar, c8.o oVar) {
        super(rVar, oVar);
    }

    @Override // com.google.android.play.core.assetpacks.j, x7.n0
    public final void b(Bundle bundle, Bundle bundle2) throws RemoteException {
        super.b(bundle, bundle2);
        this.f10850f.e((ParcelFileDescriptor) bundle.getParcelable("chunk_file_descriptor"));
    }
}
