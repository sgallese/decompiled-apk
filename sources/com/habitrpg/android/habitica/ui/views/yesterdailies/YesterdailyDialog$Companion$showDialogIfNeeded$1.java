package com.habitrpg.android.habitica.ui.views.yesterdailies;

import ad.k0;
import android.app.Activity;
import com.habitrpg.android.habitica.data.TaskRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import dc.w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: YesterdailyDialog.kt */
@f(c = "com.habitrpg.android.habitica.ui.views.yesterdailies.YesterdailyDialog$Companion$showDialogIfNeeded$1", f = "YesterdailyDialog.kt", l = {230, 234, 240, 254, 277}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class YesterdailyDialog$Companion$showDialogIfNeeded$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ TaskRepository $taskRepository;
    final /* synthetic */ UserRepository $userRepository;
    Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YesterdailyDialog$Companion$showDialogIfNeeded$1(UserRepository userRepository, TaskRepository taskRepository, Activity activity, Continuation<? super YesterdailyDialog$Companion$showDialogIfNeeded$1> continuation) {
        super(2, continuation);
        this.$userRepository = userRepository;
        this.$taskRepository = taskRepository;
        this.$activity = activity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new YesterdailyDialog$Companion$showDialogIfNeeded$1(this.$userRepository, this.$taskRepository, this.$activity, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((YesterdailyDialog$Companion$showDialogIfNeeded$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x019e  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.views.yesterdailies.YesterdailyDialog$Companion$showDialogIfNeeded$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
