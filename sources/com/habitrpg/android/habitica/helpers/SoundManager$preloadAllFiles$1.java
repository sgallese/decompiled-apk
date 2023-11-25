package com.habitrpg.android.habitica.helpers;

import ad.k0;
import dc.n;
import dc.w;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SoundManager.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.helpers.SoundManager$preloadAllFiles$1", f = "SoundManager.kt", l = {32}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class SoundManager$preloadAllFiles$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ ArrayList<SoundFile> $soundFiles;
    int label;
    final /* synthetic */ SoundManager this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SoundManager$preloadAllFiles$1(SoundManager soundManager, ArrayList<SoundFile> arrayList, Continuation<? super SoundManager$preloadAllFiles$1> continuation) {
        super(2, continuation);
        this.this$0 = soundManager;
        this.$soundFiles = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new SoundManager$preloadAllFiles$1(this.this$0, this.$soundFiles, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((SoundManager$preloadAllFiles$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        d10 = ic.d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            SoundFileLoader soundFileLoader = this.this$0.getSoundFileLoader();
            ArrayList<SoundFile> arrayList = this.$soundFiles;
            this.label = 1;
            if (soundFileLoader.download(arrayList, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
