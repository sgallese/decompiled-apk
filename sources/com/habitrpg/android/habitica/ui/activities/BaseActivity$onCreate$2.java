package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.interactors.ShowNotificationInteractor;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import com.habitrpg.common.habitica.models.Notification;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseActivity.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.BaseActivity$onCreate$2", f = "BaseActivity.kt", l = {102}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class BaseActivity$onCreate$2 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
    int label;
    final /* synthetic */ BaseActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseActivity$onCreate$2(BaseActivity baseActivity, Continuation<? super BaseActivity$onCreate$2> continuation) {
        super(2, continuation);
        this.this$0 = baseActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
        return new BaseActivity$onCreate$2(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
        return ((BaseActivity$onCreate$2) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        d10 = ic.d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                dc.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            dc.n.b(obj);
            dd.g<Notification> displayNotificationEvents = this.this$0.getNotificationsManager().getDisplayNotificationEvents();
            final BaseActivity baseActivity = this.this$0;
            dd.h<? super Notification> hVar = new dd.h() { // from class: com.habitrpg.android.habitica.ui.activities.BaseActivity$onCreate$2.1

                /* JADX INFO: Access modifiers changed from: package-private */
                /* compiled from: BaseActivity.kt */
                @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.BaseActivity$onCreate$2$1$1", f = "BaseActivity.kt", l = {105}, m = "invokeSuspend")
                /* renamed from: com.habitrpg.android.habitica.ui.activities.BaseActivity$onCreate$2$1$1  reason: invalid class name and collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C02591 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
                    int label;
                    final /* synthetic */ BaseActivity this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C02591(BaseActivity baseActivity, Continuation<? super C02591> continuation) {
                        super(2, continuation);
                        this.this$0 = baseActivity;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                        return new C02591(this.this$0, continuation);
                    }

                    @Override // pc.p
                    public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
                        return ((C02591) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        Object d10;
                        d10 = ic.d.d();
                        int i10 = this.label;
                        if (i10 != 0) {
                            if (i10 == 1) {
                                dc.n.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            dc.n.b(obj);
                            UserRepository userRepository = this.this$0.getUserRepository();
                            this.label = 1;
                            if (UserRepository.DefaultImpls.retrieveUser$default(userRepository, false, true, false, this, 4, null) == d10) {
                                return d10;
                            }
                        }
                        return dc.w.f13270a;
                    }
                }

                @Override // dd.h
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((Notification) obj2, (Continuation<? super dc.w>) continuation);
                }

                public final Object emit(Notification notification, Continuation<? super dc.w> continuation) {
                    BaseActivity baseActivity2 = BaseActivity.this;
                    if (new ShowNotificationInteractor(baseActivity2, androidx.lifecycle.w.a(baseActivity2)).handleNotification(notification)) {
                        ad.i.d(androidx.lifecycle.w.a(BaseActivity.this), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new C02591(BaseActivity.this, null), 2, null);
                    }
                    return dc.w.f13270a;
                }
            };
            this.label = 1;
            if (displayNotificationEvents.collect(hVar, this) == d10) {
                return d10;
            }
        }
        return dc.w.f13270a;
    }
}
