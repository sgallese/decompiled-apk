package com.google.android.gms.fido.u2f;

import android.app.Activity;
import android.content.IntentSender;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@Deprecated
/* loaded from: classes.dex */
public interface U2fPendingIntent {
    boolean hasPendingIntent();

    void launchPendingIntent(Activity activity, int i10) throws IntentSender.SendIntentException;
}
