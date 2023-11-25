package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.g1;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WithinAppServiceBinder.java */
/* loaded from: classes3.dex */
public class d1 extends Binder {

    /* renamed from: f  reason: collision with root package name */
    private final a f11628f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WithinAppServiceBinder.java */
    /* loaded from: classes3.dex */
    public interface a {
        Task<Void> a(Intent intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d1(a aVar) {
        this.f11628f = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(final g1.a aVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "service received new intent via bind strategy");
            }
            this.f11628f.a(aVar.f11650a).addOnCompleteListener(new s3.m(), new OnCompleteListener() { // from class: com.google.firebase.messaging.c1
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    g1.a.this.d();
                }
            });
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
