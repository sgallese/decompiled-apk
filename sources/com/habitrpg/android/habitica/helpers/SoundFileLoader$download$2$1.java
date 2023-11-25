package com.habitrpg.android.habitica.helpers;

import ad.k0;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import dc.n;
import dc.w;
import java.io.File;
import java.io.IOException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.l;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.l0;
import okio.m0;
import okio.y0;
import pc.p;
import qc.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SoundFileLoader.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.helpers.SoundFileLoader$download$2$1", f = "SoundFileLoader.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class SoundFileLoader$download$2$1 extends l implements p<k0, Continuation<? super SoundFile>, Object> {
    final /* synthetic */ SoundFile $audioFile;
    int label;
    final /* synthetic */ SoundFileLoader this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SoundFileLoader$download$2$1(SoundFileLoader soundFileLoader, SoundFile soundFile, Continuation<? super SoundFileLoader$download$2$1> continuation) {
        super(2, continuation);
        this.this$0 = soundFileLoader;
        this.$audioFile = soundFile;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new SoundFileLoader$download$2$1(this.this$0, this.$audioFile, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super SoundFile> continuation) {
        return ((SoundFileLoader$download$2$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String fullAudioFilePath;
        OkHttpClient okHttpClient;
        y0 g10;
        ic.d.d();
        if (this.label == 0) {
            n.b(obj);
            fullAudioFilePath = this.this$0.getFullAudioFilePath(this.$audioFile);
            File file = new File(fullAudioFilePath);
            if (file.exists() && file.length() > 5000) {
                file.setReadable(true, false);
                this.$audioFile.setFile(file);
                return this.$audioFile;
            }
            Request build = new Request.Builder().url(this.$audioFile.getWebUrl()).build();
            try {
                okHttpClient = this.this$0.client;
                Response execute = FirebasePerfOkHttpClient.execute(okHttpClient.newCall(build));
                if (execute.isSuccessful()) {
                    try {
                        g10 = m0.g(file, false, 1, null);
                        okio.d c10 = l0.c(g10);
                        ResponseBody body = execute.body();
                        q.f(body);
                        c10.g0(body.source());
                        c10.flush();
                        c10.close();
                        file.setReadable(true, false);
                        this.$audioFile.setFile(file);
                        return this.$audioFile;
                    } catch (IOException unused) {
                        return this.$audioFile;
                    }
                }
                throw new IOException();
            } catch (IOException unused2) {
                return this.$audioFile;
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
