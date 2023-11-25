package com.habitrpg.android.habitica.data.implementation;

import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.data.ApiClient;
import com.habitrpg.android.habitica.data.TaskRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.data.local.UserLocalRepository;
import com.habitrpg.android.habitica.helpers.AppConfigManager;
import com.habitrpg.android.habitica.models.Achievement;
import com.habitrpg.android.habitica.models.QuestAchievement;
import com.habitrpg.android.habitica.models.Skill;
import com.habitrpg.android.habitica.models.TeamPlan;
import com.habitrpg.android.habitica.models.inventory.Customization;
import com.habitrpg.android.habitica.models.responses.UnlockResponse;
import com.habitrpg.android.habitica.models.social.Group;
import com.habitrpg.android.habitica.models.user.Stats;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.models.user.UserQuestStatus;
import com.habitrpg.android.habitica.modules.AuthenticationHandler;
import com.habitrpg.shared.habitica.models.responses.VerifyUsernameResponse;
import dc.r;
import dc.w;
import dd.g;
import dd.i;
import ec.m0;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import qc.h;
import qc.q;

/* compiled from: UserRepositoryImpl.kt */
/* loaded from: classes4.dex */
public final class UserRepositoryImpl extends BaseRepositoryImpl<UserLocalRepository> implements UserRepository {
    private static String lastReadNotification;
    private static Date lastSync;
    private final AppConfigManager appConfigManager;
    private final TaskRepository taskRepository;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: UserRepositoryImpl.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserRepositoryImpl(UserLocalRepository userLocalRepository, ApiClient apiClient, AuthenticationHandler authenticationHandler, TaskRepository taskRepository, AppConfigManager appConfigManager) {
        super(userLocalRepository, apiClient, authenticationHandler);
        q.i(userLocalRepository, "localRepository");
        q.i(apiClient, "apiClient");
        q.i(authenticationHandler, "authenticationHandler");
        q.i(taskRepository, "taskRepository");
        q.i(appConfigManager, "appConfigManager");
        this.taskRepository = taskRepository;
        this.appConfigManager = appConfigManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getLiveUser(kotlin.coroutines.Continuation<? super com.habitrpg.android.habitica.models.user.User> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$getLiveUser$1
            if (r0 == 0) goto L13
            r0 = r5
            com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$getLiveUser$1 r0 = (com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$getLiveUser$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$getLiveUser$1 r0 = new com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$getLiveUser$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl r0 = (com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl) r0
            dc.n.b(r5)
            goto L52
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            dc.n.b(r5)
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r5 = r4.getLocalRepository()
            com.habitrpg.android.habitica.data.local.UserLocalRepository r5 = (com.habitrpg.android.habitica.data.local.UserLocalRepository) r5
            java.lang.String r2 = r4.getCurrentUserID()
            dd.g r5 = r5.getUser(r2)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = dd.i.x(r5, r0)
            if (r5 != r1) goto L51
            return r1
        L51:
            r0 = r4
        L52:
            com.habitrpg.android.habitica.models.user.User r5 = (com.habitrpg.android.habitica.models.user.User) r5
            if (r5 != 0) goto L58
            r5 = 0
            return r5
        L58:
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r0 = r0.getLocalRepository()
            com.habitrpg.android.habitica.data.local.UserLocalRepository r0 = (com.habitrpg.android.habitica.data.local.UserLocalRepository) r0
            com.habitrpg.android.habitica.models.BaseObject r5 = r0.getLiveObject(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl.getLiveUser(kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final User mergeUser(User user, User user2) {
        Stats stats;
        if (user != null && user.isValid()) {
            if (user.isManaged()) {
                user = (User) getLocalRepository().getUnmanagedCopy((UserLocalRepository) user);
            }
            if (user2.getInbox() != null) {
                user.setInbox(user2.getInbox());
            }
            if (user2.getItems() != null) {
                user.setItems(user2.getItems());
            }
            if (user2.getPreferences() != null) {
                user.setPreferences(user2.getPreferences());
            }
            if (user2.getFlags() != null) {
                user.setFlags(user2.getFlags());
            }
            if (user2.getStats() != null && (stats = user.getStats()) != null) {
                stats.merge(user2.getStats());
            }
            if (user2.getProfile() != null) {
                user.setProfile(user2.getProfile());
            }
            if (user2.getParty() != null) {
                user.setParty(user2.getParty());
            }
            user.setNeedsCron(user2.getNeedsCron());
            user.setVersionNumber(user2.getVersionNumber());
            getLocalRepository().saveUser(user, false);
            return user;
        } else if (user == null) {
            return user2;
        } else {
            return user;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateUser(java.lang.String r7, java.util.Map<java.lang.String, ? extends java.lang.Object> r8, kotlin.coroutines.Continuation<? super com.habitrpg.android.habitica.models.user.User> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$updateUser$1
            if (r0 == 0) goto L13
            r0 = r9
            com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$updateUser$1 r0 = (com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$updateUser$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$updateUser$1 r0 = new com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$updateUser$1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r7 = r0.L$1
            com.habitrpg.android.habitica.models.user.User r7 = (com.habitrpg.android.habitica.models.user.User) r7
            java.lang.Object r8 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl r8 = (com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl) r8
            dc.n.b(r9)
            goto L7d
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            java.lang.Object r7 = r0.L$1
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl r8 = (com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl) r8
            dc.n.b(r9)
            goto L5d
        L48:
            dc.n.b(r9)
            com.habitrpg.android.habitica.data.ApiClient r9 = r6.getApiClient()
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r4
            java.lang.Object r9 = r9.updateUser(r8, r0)
            if (r9 != r1) goto L5c
            return r1
        L5c:
            r8 = r6
        L5d:
            com.habitrpg.android.habitica.models.user.User r9 = (com.habitrpg.android.habitica.models.user.User) r9
            if (r9 != 0) goto L63
            r7 = 0
            return r7
        L63:
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r2 = r8.getLocalRepository()
            com.habitrpg.android.habitica.data.local.UserLocalRepository r2 = (com.habitrpg.android.habitica.data.local.UserLocalRepository) r2
            dd.g r7 = r2.getUser(r7)
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r3
            java.lang.Object r7 = dd.i.x(r7, r0)
            if (r7 != r1) goto L7a
            return r1
        L7a:
            r5 = r9
            r9 = r7
            r7 = r5
        L7d:
            com.habitrpg.android.habitica.models.user.User r9 = (com.habitrpg.android.habitica.models.user.User) r9
            com.habitrpg.android.habitica.models.user.User r7 = r8.mergeUser(r9, r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl.updateUser(java.lang.String, java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    @Override // com.habitrpg.android.habitica.data.UserRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object allocatePoint(com.habitrpg.shared.habitica.models.tasks.Attribute r8, kotlin.coroutines.Continuation<? super com.habitrpg.android.habitica.models.user.Stats> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$allocatePoint$1
            if (r0 == 0) goto L13
            r0 = r9
            com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$allocatePoint$1 r0 = (com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$allocatePoint$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$allocatePoint$1 r0 = new com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$allocatePoint$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r8 = r0.L$1
            com.habitrpg.android.habitica.models.user.User r8 = (com.habitrpg.android.habitica.models.user.User) r8
            java.lang.Object r0 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl r0 = (com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl) r0
            dc.n.b(r9)
            goto L84
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3c:
            java.lang.Object r8 = r0.L$1
            com.habitrpg.shared.habitica.models.tasks.Attribute r8 = (com.habitrpg.shared.habitica.models.tasks.Attribute) r8
            java.lang.Object r2 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl r2 = (com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl) r2
            dc.n.b(r9)
            goto L59
        L48:
            dc.n.b(r9)
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r4
            java.lang.Object r9 = r7.getLiveUser(r0)
            if (r9 != r1) goto L58
            return r1
        L58:
            r2 = r7
        L59:
            com.habitrpg.android.habitica.models.user.User r9 = (com.habitrpg.android.habitica.models.user.User) r9
            if (r9 == 0) goto L6b
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r4 = r2.getLocalRepository()
            com.habitrpg.android.habitica.data.local.UserLocalRepository r4 = (com.habitrpg.android.habitica.data.local.UserLocalRepository) r4
            com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$allocatePoint$2 r5 = new com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$allocatePoint$2
            r5.<init>(r8, r9)
            r4.executeTransaction(r5)
        L6b:
            com.habitrpg.android.habitica.data.ApiClient r4 = r2.getApiClient()
            java.lang.String r8 = r8.getValue()
            r0.L$0 = r2
            r0.L$1 = r9
            r0.label = r3
            java.lang.Object r8 = r4.allocatePoint(r8, r0)
            if (r8 != r1) goto L80
            return r1
        L80:
            r0 = r2
            r6 = r9
            r9 = r8
            r8 = r6
        L84:
            com.habitrpg.android.habitica.models.user.Stats r9 = (com.habitrpg.android.habitica.models.user.Stats) r9
            if (r9 != 0) goto L8a
            r8 = 0
            return r8
        L8a:
            if (r8 == 0) goto L9a
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r0 = r0.getLocalRepository()
            com.habitrpg.android.habitica.data.local.UserLocalRepository r0 = (com.habitrpg.android.habitica.data.local.UserLocalRepository) r0
            com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$allocatePoint$3 r1 = new com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$allocatePoint$3
            r1.<init>(r8, r9)
            r0.executeTransaction(r1)
        L9a:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl.allocatePoint(com.habitrpg.shared.habitica.models.tasks.Attribute, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    @Override // com.habitrpg.android.habitica.data.UserRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object bulkAllocatePoints(int r10, int r11, int r12, int r13, kotlin.coroutines.Continuation<? super com.habitrpg.android.habitica.models.user.Stats> r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$bulkAllocatePoints$1
            if (r0 == 0) goto L13
            r0 = r14
            com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$bulkAllocatePoints$1 r0 = (com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$bulkAllocatePoints$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$bulkAllocatePoints$1 r0 = new com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$bulkAllocatePoints$1
            r0.<init>(r9, r14)
        L18:
            java.lang.Object r14 = r0.result
            java.lang.Object r7 = ic.b.d()
            int r1 = r0.label
            r8 = 2
            r2 = 1
            if (r1 == 0) goto L45
            if (r1 == r2) goto L3c
            if (r1 != r8) goto L34
            java.lang.Object r10 = r0.L$1
            com.habitrpg.android.habitica.models.user.Stats r10 = (com.habitrpg.android.habitica.models.user.Stats) r10
            java.lang.Object r11 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl r11 = (com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl) r11
            dc.n.b(r14)
            goto L71
        L34:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3c:
            java.lang.Object r10 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl r10 = (com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl) r10
            dc.n.b(r14)
            r11 = r10
            goto L5d
        L45:
            dc.n.b(r14)
            com.habitrpg.android.habitica.data.ApiClient r1 = r9.getApiClient()
            r0.L$0 = r9
            r0.label = r2
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r0
            java.lang.Object r14 = r1.bulkAllocatePoints(r2, r3, r4, r5, r6)
            if (r14 != r7) goto L5c
            return r7
        L5c:
            r11 = r9
        L5d:
            r10 = r14
            com.habitrpg.android.habitica.models.user.Stats r10 = (com.habitrpg.android.habitica.models.user.Stats) r10
            if (r10 != 0) goto L64
            r10 = 0
            return r10
        L64:
            r0.L$0 = r11
            r0.L$1 = r10
            r0.label = r8
            java.lang.Object r14 = r11.getLiveUser(r0)
            if (r14 != r7) goto L71
            return r7
        L71:
            com.habitrpg.android.habitica.models.user.User r14 = (com.habitrpg.android.habitica.models.user.User) r14
            if (r14 == 0) goto L83
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r11 = r11.getLocalRepository()
            com.habitrpg.android.habitica.data.local.UserLocalRepository r11 = (com.habitrpg.android.habitica.data.local.UserLocalRepository) r11
            com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$bulkAllocatePoints$2 r12 = new com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$bulkAllocatePoints$2
            r12.<init>(r10)
            r11.modify(r14, r12)
        L83:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl.bulkAllocatePoints(int, int, int, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063 A[PHI: r10
      0x0063: PHI (r10v5 java.lang.Object) = (r10v4 java.lang.Object), (r10v1 java.lang.Object) binds: [B:21:0x0060, B:12:0x0029] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // com.habitrpg.android.habitica.data.UserRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object changeClass(java.lang.String r9, kotlin.coroutines.Continuation<? super com.habitrpg.android.habitica.models.user.User> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$changeClass$1
            if (r0 == 0) goto L13
            r0 = r10
            com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$changeClass$1 r0 = (com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$changeClass$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$changeClass$1 r0 = new com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$changeClass$1
            r0.<init>(r8, r10)
        L18:
            r5 = r0
            java.lang.Object r10 = r5.result
            java.lang.Object r0 = ic.b.d()
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3e
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2d
            dc.n.b(r10)
            goto L63
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            java.lang.Object r9 = r5.L$0
            com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl r9 = (com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl) r9
            dc.n.b(r10)
            r1 = r9
            goto L51
        L3e:
            dc.n.b(r10)
            com.habitrpg.android.habitica.data.ApiClient r10 = r8.getApiClient()
            r5.L$0 = r8
            r5.label = r3
            java.lang.Object r9 = r10.changeClass(r9, r5)
            if (r9 != r0) goto L50
            return r0
        L50:
            r1 = r8
        L51:
            r9 = 0
            r3 = 1
            r4 = 0
            r6 = 4
            r7 = 0
            r10 = 0
            r5.L$0 = r10
            r5.label = r2
            r2 = r9
            java.lang.Object r10 = com.habitrpg.android.habitica.data.UserRepository.DefaultImpls.retrieveUser$default(r1, r2, r3, r4, r5, r6, r7)
            if (r10 != r0) goto L63
            return r0
        L63:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl.changeClass(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.habitrpg.android.habitica.data.UserRepository
    public Object changeCustomDayStart(int i10, Continuation<? super User> continuation) {
        HashMap hashMap = new HashMap();
        hashMap.put("dayStart", b.d(i10));
        return getApiClient().changeCustomDayStart(hashMap, continuation);
    }

    @Override // com.habitrpg.android.habitica.data.UserRepository
    public Object deleteAccount(String str, Continuation<? super Void> continuation) {
        return getApiClient().deleteAccount(str, continuation);
    }

    @Override // com.habitrpg.android.habitica.data.UserRepository
    public Object disableClasses(Continuation<? super User> continuation) {
        return getApiClient().disableClasses(continuation);
    }

    @Override // com.habitrpg.android.habitica.data.UserRepository
    public g<List<Achievement>> getAchievements() {
        return getLocalRepository().getAchievements();
    }

    @Override // com.habitrpg.android.habitica.data.UserRepository
    public Object getNews(Continuation<? super List<? extends Object>> continuation) {
        return getApiClient().getNews(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    @Override // com.habitrpg.android.habitica.data.UserRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object getNewsNotification(kotlin.coroutines.Continuation<? super com.habitrpg.common.habitica.models.Notification> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$getNewsNotification$1
            if (r0 == 0) goto L13
            r0 = r5
            com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$getNewsNotification$1 r0 = (com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$getNewsNotification$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$getNewsNotification$1 r0 = new com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$getNewsNotification$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            dc.n.b(r5)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            dc.n.b(r5)
            com.habitrpg.android.habitica.data.ApiClient r5 = r4.getApiClient()
            r0.label = r3
            java.lang.Object r5 = r5.getNews(r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L4a
            java.lang.Object r5 = ec.r.a0(r5)
            goto L4b
        L4a:
            r5 = 0
        L4b:
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.Map<*, *>"
            qc.q.g(r5, r0)
            java.util.Map r5 = (java.util.Map) r5
            java.lang.String r0 = "title"
            java.lang.Object r5 = r5.get(r0)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.String"
            qc.q.g(r5, r0)
            java.lang.String r5 = (java.lang.String) r5
            com.habitrpg.common.habitica.models.Notification r0 = new com.habitrpg.common.habitica.models.Notification
            r0.<init>()
            java.lang.String r1 = "custom-new-stuff-notification"
            r0.setId(r1)
            com.habitrpg.common.habitica.models.Notification$Type r1 = com.habitrpg.common.habitica.models.Notification.Type.NEW_STUFF
            java.lang.String r1 = r1.getType()
            r0.setType(r1)
            com.habitrpg.common.habitica.models.notifications.NewStuffData r1 = new com.habitrpg.common.habitica.models.notifications.NewStuffData
            r1.<init>()
            r1.setTitle(r5)
            r0.setData(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl.getNewsNotification(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.habitrpg.android.habitica.data.UserRepository
    public g<List<QuestAchievement>> getQuestAchievements() {
        return getLocalRepository().getQuestAchievements(getCurrentUserID());
    }

    @Override // com.habitrpg.android.habitica.data.UserRepository
    public g<List<Skill>> getSkills(User user) {
        q.i(user, "user");
        return getLocalRepository().getSkills(user);
    }

    @Override // com.habitrpg.android.habitica.data.UserRepository
    public g<List<Skill>> getSpecialItems(User user) {
        q.i(user, "user");
        return getLocalRepository().getSpecialItems(user);
    }

    @Override // com.habitrpg.android.habitica.data.UserRepository
    public g<Group> getTeamPlan(final String str) {
        q.i(str, "teamID");
        final g<Group> teamPlan = getLocalRepository().getTeamPlan(str);
        return new g<Group>() { // from class: com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$getTeamPlan$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$getTeamPlan$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements dd.h {
                final /* synthetic */ String $teamID$inlined;
                final /* synthetic */ dd.h $this_unsafeFlow;
                final /* synthetic */ UserRepositoryImpl this$0;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$getTeamPlan$$inlined$map$1$2", f = "UserRepositoryImpl.kt", l = {224, 223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$getTeamPlan$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends d {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= RecyclerView.UNDEFINED_DURATION;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(dd.h hVar, UserRepositoryImpl userRepositoryImpl, String str) {
                    this.$this_unsafeFlow = hVar;
                    this.this$0 = userRepositoryImpl;
                    this.$teamID$inlined = str;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
                /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
                /* JADX WARN: Removed duplicated region for block: B:25:0x0065 A[RETURN] */
                @Override // dd.h
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$getTeamPlan$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$getTeamPlan$$inlined$map$1$2$1 r0 = (com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$getTeamPlan$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$getTeamPlan$$inlined$map$1$2$1 r0 = new com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$getTeamPlan$$inlined$map$1$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L3c
                        if (r2 == r4) goto L34
                        if (r2 != r3) goto L2c
                        dc.n.b(r8)
                        goto L66
                    L2c:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L34:
                        java.lang.Object r7 = r0.L$0
                        dd.h r7 = (dd.h) r7
                        dc.n.b(r8)
                        goto L57
                    L3c:
                        dc.n.b(r8)
                        dd.h r8 = r6.$this_unsafeFlow
                        com.habitrpg.android.habitica.models.social.Group r7 = (com.habitrpg.android.habitica.models.social.Group) r7
                        if (r7 != 0) goto L5a
                        com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl r7 = r6.this$0
                        java.lang.String r2 = r6.$teamID$inlined
                        r0.L$0 = r8
                        r0.label = r4
                        java.lang.Object r7 = r7.retrieveTeamPlan(r2, r0)
                        if (r7 != r1) goto L54
                        return r1
                    L54:
                        r5 = r8
                        r8 = r7
                        r7 = r5
                    L57:
                        r5 = r8
                        r8 = r7
                        r7 = r5
                    L5a:
                        r2 = 0
                        r0.L$0 = r2
                        r0.label = r3
                        java.lang.Object r7 = r8.emit(r7, r0)
                        if (r7 != r1) goto L66
                        return r1
                    L66:
                        dc.w r7 = dc.w.f13270a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$getTeamPlan$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(dd.h<? super Group> hVar, Continuation continuation) {
                Object d10;
                Object collect = g.this.collect(new AnonymousClass2(hVar, this, str), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        };
    }

    @Override // com.habitrpg.android.habitica.data.UserRepository
    public g<List<TeamPlan>> getTeamPlans() {
        return getLocalRepository().getTeamPlans(getCurrentUserID());
    }

    @Override // com.habitrpg.android.habitica.data.UserRepository
    public g<User> getUser() {
        return i.R(getAuthenticationHandler().getUserIDFlow(), new UserRepositoryImpl$getUser$$inlined$flatMapLatest$1(null, this));
    }

    @Override // com.habitrpg.android.habitica.data.UserRepository
    public g<UserQuestStatus> getUserQuestStatus() {
        return getLocalRepository().getUserQuestStatus(getCurrentUserID());
    }

    @Override // com.habitrpg.android.habitica.data.UserRepository
    public Object readNotification(String str, Continuation<? super List<? extends Object>> continuation) {
        if (q.d(lastReadNotification, str)) {
            return null;
        }
        lastReadNotification = str;
        return getApiClient().readNotification(str, continuation);
    }

    @Override // com.habitrpg.android.habitica.data.UserRepository
    public Object readNotifications(Map<String, ? extends List<String>> map, Continuation<? super List<? extends Object>> continuation) {
        return getApiClient().readNotifications(map, continuation);
    }

    @Override // com.habitrpg.android.habitica.data.UserRepository
    public Object reroll(Continuation<? super User> continuation) {
        return getApiClient().reroll(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062 A[PHI: r10
      0x0062: PHI (r10v6 java.lang.Object) = (r10v5 java.lang.Object), (r10v1 java.lang.Object) binds: [B:21:0x005f, B:12:0x0029] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // com.habitrpg.android.habitica.data.UserRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object resetAccount(kotlin.coroutines.Continuation<? super com.habitrpg.android.habitica.models.user.User> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$resetAccount$1
            if (r0 == 0) goto L13
            r0 = r10
            com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$resetAccount$1 r0 = (com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$resetAccount$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$resetAccount$1 r0 = new com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$resetAccount$1
            r0.<init>(r9, r10)
        L18:
            r5 = r0
            java.lang.Object r10 = r5.result
            java.lang.Object r0 = ic.b.d()
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3d
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2d
            dc.n.b(r10)
            goto L62
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L35:
            java.lang.Object r1 = r5.L$0
            com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl r1 = (com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl) r1
            dc.n.b(r10)
            goto L50
        L3d:
            dc.n.b(r10)
            com.habitrpg.android.habitica.data.ApiClient r10 = r9.getApiClient()
            r5.L$0 = r9
            r5.label = r3
            java.lang.Object r10 = r10.resetAccount(r5)
            if (r10 != r0) goto L4f
            return r0
        L4f:
            r1 = r9
        L50:
            r10 = 1
            r3 = 1
            r4 = 0
            r6 = 4
            r7 = 0
            r8 = 0
            r5.L$0 = r8
            r5.label = r2
            r2 = r10
            java.lang.Object r10 = com.habitrpg.android.habitica.data.UserRepository.DefaultImpls.retrieveUser$default(r1, r2, r3, r4, r5, r6, r7)
            if (r10 != r0) goto L62
            return r0
        L62:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl.resetAccount(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
    @Override // com.habitrpg.android.habitica.data.UserRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object resetTutorial(kotlin.coroutines.Continuation<? super com.habitrpg.android.habitica.models.user.User> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$resetTutorial$1
            if (r0 == 0) goto L13
            r0 = r9
            com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$resetTutorial$1 r0 = (com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$resetTutorial$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$resetTutorial$1 r0 = new com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$resetTutorial$1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L47
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            dc.n.b(r9)
            goto L9c
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L37:
            java.lang.Object r2 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl r2 = (com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl) r2
            dc.n.b(r9)
            goto L69
        L3f:
            java.lang.Object r2 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl r2 = (com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl) r2
            dc.n.b(r9)
            goto L5c
        L47:
            dc.n.b(r9)
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r9 = r8.getLocalRepository()
            com.habitrpg.android.habitica.data.local.UserLocalRepository r9 = (com.habitrpg.android.habitica.data.local.UserLocalRepository) r9
            r0.L$0 = r8
            r0.label = r5
            java.lang.Object r9 = r9.getTutorialSteps(r0)
            if (r9 != r1) goto L5b
            return r1
        L5b:
            r2 = r8
        L5c:
            dd.g r9 = (dd.g) r9
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r9 = dd.i.x(r9, r0)
            if (r9 != r1) goto L69
            return r1
        L69:
            io.realm.g1 r9 = (io.realm.g1) r9
            r4 = 0
            if (r9 != 0) goto L6f
            return r4
        L6f:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.util.Iterator r9 = r9.iterator()
        L78:
            boolean r6 = r9.hasNext()
            if (r6 == 0) goto L91
            java.lang.Object r6 = r9.next()
            com.habitrpg.android.habitica.models.TutorialStep r6 = (com.habitrpg.android.habitica.models.TutorialStep) r6
            java.lang.String r6 = r6.getFlagPath()
            r7 = 0
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.b.a(r7)
            r5.put(r6, r7)
            goto L78
        L91:
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r9 = r2.updateUser(r5, r0)
            if (r9 != r1) goto L9c
            return r1
        L9c:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl.resetTutorial(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    @Override // com.habitrpg.android.habitica.data.UserRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object retrieveAchievements(kotlin.coroutines.Continuation<? super java.util.List<? extends com.habitrpg.android.habitica.models.Achievement>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$retrieveAchievements$1
            if (r0 == 0) goto L13
            r0 = r5
            com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$retrieveAchievements$1 r0 = (com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$retrieveAchievements$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$retrieveAchievements$1 r0 = new com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$retrieveAchievements$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl r0 = (com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl) r0
            dc.n.b(r5)
            goto L4c
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            dc.n.b(r5)
            com.habitrpg.android.habitica.data.ApiClient r5 = r4.getApiClient()
            java.lang.String r2 = r4.getCurrentUserID()
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.getMemberAchievements(r2, r0)
            if (r5 != r1) goto L4b
            return r1
        L4b:
            r0 = r4
        L4c:
            java.util.List r5 = (java.util.List) r5
            if (r5 != 0) goto L52
            r5 = 0
            return r5
        L52:
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r0 = r0.getLocalRepository()
            com.habitrpg.android.habitica.data.local.UserLocalRepository r0 = (com.habitrpg.android.habitica.data.local.UserLocalRepository) r0
            r0.save(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl.retrieveAchievements(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d7  */
    @Override // com.habitrpg.android.habitica.data.UserRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object retrieveTeamPlan(java.lang.String r11, kotlin.coroutines.Continuation<? super com.habitrpg.android.habitica.models.social.Group> r12) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl.retrieveTeamPlan(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    @Override // com.habitrpg.android.habitica.data.UserRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object retrieveTeamPlans(kotlin.coroutines.Continuation<? super java.util.List<? extends com.habitrpg.android.habitica.models.TeamPlan>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$retrieveTeamPlans$1
            if (r0 == 0) goto L13
            r0 = r5
            com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$retrieveTeamPlans$1 r0 = (com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$retrieveTeamPlans$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$retrieveTeamPlans$1 r0 = new com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$retrieveTeamPlans$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl r0 = (com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl) r0
            dc.n.b(r5)
            goto L48
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            dc.n.b(r5)
            com.habitrpg.android.habitica.data.ApiClient r5 = r4.getApiClient()
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.getTeamPlans(r0)
            if (r5 != r1) goto L47
            return r1
        L47:
            r0 = r4
        L48:
            java.util.List r5 = (java.util.List) r5
            if (r5 != 0) goto L4e
            r5 = 0
            return r5
        L4e:
            r1 = r5
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L55:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L69
            java.lang.Object r2 = r1.next()
            com.habitrpg.android.habitica.models.TeamPlan r2 = (com.habitrpg.android.habitica.models.TeamPlan) r2
            java.lang.String r3 = r0.getCurrentUserID()
            r2.setUserID(r3)
            goto L55
        L69:
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r0 = r0.getLocalRepository()
            com.habitrpg.android.habitica.data.local.UserLocalRepository r0 = (com.habitrpg.android.habitica.data.local.UserLocalRepository) r0
            r0.save(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl.retrieveTeamPlans(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010f A[RETURN] */
    @Override // com.habitrpg.android.habitica.data.UserRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object retrieveUser(boolean r11, boolean r12, boolean r13, kotlin.coroutines.Continuation<? super com.habitrpg.android.habitica.models.user.User> r14) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl.retrieveUser(boolean, boolean, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0122 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0123  */
    @Override // com.habitrpg.android.habitica.data.UserRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object revive(kotlin.coroutines.Continuation<? super com.habitrpg.android.habitica.models.inventory.Equipment> r17) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl.revive(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.habitrpg.android.habitica.data.UserRepository
    public Object runCron(Continuation<? super w> continuation) {
        Object d10;
        Object runCron = runCron(new ArrayList(), continuation);
        d10 = ic.d.d();
        return runCron == d10 ? runCron : w.f13270a;
    }

    @Override // com.habitrpg.android.habitica.data.UserRepository
    public Object seeNotifications(Map<String, ? extends List<String>> map, Continuation<? super List<? extends Object>> continuation) {
        return getApiClient().seeNotifications(map, continuation);
    }

    @Override // com.habitrpg.android.habitica.data.UserRepository
    public Object sendPasswordResetEmail(String str, Continuation<? super Void> continuation) {
        return getApiClient().sendPasswordResetEmail(str, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Type inference failed for: r8v3, types: [int] */
    @Override // com.habitrpg.android.habitica.data.UserRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object sleep(com.habitrpg.android.habitica.models.user.User r8, kotlin.coroutines.Continuation<? super com.habitrpg.android.habitica.models.user.User> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$sleep$1
            if (r0 == 0) goto L13
            r0 = r9
            com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$sleep$1 r0 = (com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$sleep$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$sleep$1 r0 = new com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$sleep$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 != r4) goto L39
            int r8 = r0.I$0
            java.lang.Object r1 = r0.L$1
            com.habitrpg.android.habitica.models.user.User r1 = (com.habitrpg.android.habitica.models.user.User) r1
            java.lang.Object r0 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl r0 = (com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl) r0
            dc.n.b(r9)
            r6 = r9
            r9 = r8
            r8 = r1
            r1 = r0
            r0 = r6
            goto L73
        L39:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L41:
            dc.n.b(r9)
            com.habitrpg.android.habitica.models.user.Preferences r9 = r8.getPreferences()
            if (r9 == 0) goto L4f
            boolean r9 = r9.getSleep()
            goto L50
        L4f:
            r9 = 0
        L50:
            r9 = r9 ^ r4
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r2 = r7.getLocalRepository()
            com.habitrpg.android.habitica.data.local.UserLocalRepository r2 = (com.habitrpg.android.habitica.data.local.UserLocalRepository) r2
            com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$sleep$2 r5 = new com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$sleep$2
            r5.<init>(r9)
            r2.modify(r8, r5)
            com.habitrpg.android.habitica.data.ApiClient r2 = r7.getApiClient()
            r0.L$0 = r7
            r0.L$1 = r8
            r0.I$0 = r9
            r0.label = r4
            java.lang.Object r0 = r2.sleep(r0)
            if (r0 != r1) goto L72
            return r1
        L72:
            r1 = r7
        L73:
            if (r0 != 0) goto L86
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r0 = r1.getLocalRepository()
            com.habitrpg.android.habitica.data.local.UserLocalRepository r0 = (com.habitrpg.android.habitica.data.local.UserLocalRepository) r0
            com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$sleep$3 r1 = new com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$sleep$3
            if (r9 == 0) goto L80
            r3 = 1
        L80:
            r1.<init>(r3)
            r0.modify(r8, r1)
        L86:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl.sleep(com.habitrpg.android.habitica.models.user.User, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.habitrpg.android.habitica.data.UserRepository
    public Object unlockPath(Customization customization, Continuation<? super UnlockResponse> continuation) {
        String path = customization.getPath();
        Integer price = customization.getPrice();
        return unlockPath(path, price != null ? price.intValue() : 0, continuation);
    }

    @Override // com.habitrpg.android.habitica.data.UserRepository
    public Object updateEmail(String str, String str2, Continuation<? super Void> continuation) {
        CharSequence T0;
        ApiClient apiClient = getApiClient();
        T0 = yc.w.T0(str);
        return apiClient.updateEmail(T0.toString(), str2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    @Override // com.habitrpg.android.habitica.data.UserRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object updateLanguage(java.lang.String r5, kotlin.coroutines.Continuation<? super com.habitrpg.android.habitica.models.user.User> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$updateLanguage$1
            if (r0 == 0) goto L13
            r0 = r6
            com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$updateLanguage$1 r0 = (com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$updateLanguage$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$updateLanguage$1 r0 = new com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$updateLanguage$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.L$1
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r0 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl r0 = (com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl) r0
            dc.n.b(r6)
            goto L4c
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            dc.n.b(r6)
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            java.lang.String r6 = "preferences.language"
            java.lang.Object r6 = r4.updateUser(r6, r5, r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            r0 = r4
        L4c:
            com.habitrpg.android.habitica.models.user.User r6 = (com.habitrpg.android.habitica.models.user.User) r6
            com.habitrpg.android.habitica.data.ApiClient r0 = r0.getApiClient()
            r0.setLanguageCode(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl.updateLanguage(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ba  */
    @Override // com.habitrpg.android.habitica.data.UserRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object updateLoginName(java.lang.String r7, java.lang.String r8, kotlin.coroutines.Continuation<? super com.habitrpg.android.habitica.models.user.User> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$updateLoginName$1
            if (r0 == 0) goto L13
            r0 = r9
            com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$updateLoginName$1 r0 = (com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$updateLoginName$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$updateLoginName$1 r0 = new com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$updateLoginName$1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4c
            if (r2 == r5) goto L40
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r7 = r0.L$1
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl r8 = (com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl) r8
            dc.n.b(r9)
            goto Lb4
        L38:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L40:
            java.lang.Object r7 = r0.L$1
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl r8 = (com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl) r8
            dc.n.b(r9)
            goto L99
        L4c:
            dc.n.b(r9)
            if (r8 == 0) goto L5a
            int r9 = r8.length()
            if (r9 != 0) goto L58
            goto L5a
        L58:
            r9 = 0
            goto L5b
        L5a:
            r9 = 1
        L5b:
            if (r9 != 0) goto L80
            com.habitrpg.android.habitica.data.ApiClient r9 = r6.getApiClient()
            java.lang.CharSequence r2 = yc.m.T0(r7)
            java.lang.String r2 = r2.toString()
            java.lang.CharSequence r8 = yc.m.T0(r8)
            java.lang.String r8 = r8.toString()
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r5
            java.lang.Object r8 = r9.updateLoginName(r2, r8, r0)
            if (r8 != r1) goto L7e
            return r1
        L7e:
            r8 = r6
            goto L99
        L80:
            com.habitrpg.android.habitica.data.ApiClient r8 = r6.getApiClient()
            java.lang.CharSequence r9 = yc.m.T0(r7)
            java.lang.String r9 = r9.toString()
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r4
            java.lang.Object r8 = r8.updateUsername(r9, r0)
            if (r8 != r1) goto L7e
            return r1
        L99:
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r9 = r8.getLocalRepository()
            com.habitrpg.android.habitica.data.local.UserLocalRepository r9 = (com.habitrpg.android.habitica.data.local.UserLocalRepository) r9
            java.lang.String r2 = r8.getCurrentUserID()
            dd.g r9 = r9.getUser(r2)
            r0.L$0 = r8
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r9 = dd.i.x(r9, r0)
            if (r9 != r1) goto Lb4
            return r1
        Lb4:
            com.habitrpg.android.habitica.models.user.User r9 = (com.habitrpg.android.habitica.models.user.User) r9
            if (r9 != 0) goto Lba
            r7 = 0
            return r7
        Lba:
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r8 = r8.getLocalRepository()
            com.habitrpg.android.habitica.data.local.UserLocalRepository r8 = (com.habitrpg.android.habitica.data.local.UserLocalRepository) r8
            com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$updateLoginName$2 r0 = new com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$updateLoginName$2
            r0.<init>(r7)
            r8.modify(r9, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl.updateLoginName(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.habitrpg.android.habitica.data.UserRepository
    public Object updatePassword(String str, String str2, String str3, Continuation<? super Void> continuation) {
        CharSequence T0;
        CharSequence T02;
        CharSequence T03;
        ApiClient apiClient = getApiClient();
        T0 = yc.w.T0(str);
        String obj = T0.toString();
        T02 = yc.w.T0(str2);
        String obj2 = T02.toString();
        T03 = yc.w.T0(str3);
        return apiClient.updatePassword(obj, obj2, T03.toString(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d3 A[PHI: r13
      0x00d3: PHI (r13v14 java.lang.Object) = (r13v13 java.lang.Object), (r13v1 java.lang.Object) binds: [B:36:0x00d0, B:17:0x003d] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d4  */
    @Override // com.habitrpg.android.habitica.data.UserRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object useCustomization(java.lang.String r10, java.lang.String r11, java.lang.String r12, kotlin.coroutines.Continuation<? super com.habitrpg.android.habitica.models.user.User> r13) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl.useCustomization(java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    @Override // com.habitrpg.android.habitica.data.UserRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object useSkill(java.lang.String r7, java.lang.String r8, java.lang.String r9, kotlin.coroutines.Continuation<? super com.habitrpg.android.habitica.models.responses.SkillResponse> r10) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl.useSkill(java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.habitrpg.android.habitica.data.UserRepository
    public Object verifyUsername(String str, Continuation<? super VerifyUsernameResponse> continuation) {
        CharSequence T0;
        ApiClient apiClient = getApiClient();
        T0 = yc.w.T0(str);
        return apiClient.verifyUsername(T0.toString(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f3 A[RETURN] */
    @Override // com.habitrpg.android.habitica.data.UserRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object runCron(java.util.List<com.habitrpg.android.habitica.models.tasks.Task> r12, kotlin.coroutines.Continuation<? super dc.w> r13) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl.runCron(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    @Override // com.habitrpg.android.habitica.data.UserRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object unlockPath(java.lang.String r7, int r8, kotlin.coroutines.Continuation<? super com.habitrpg.android.habitica.models.responses.UnlockResponse> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$unlockPath$2
            if (r0 == 0) goto L13
            r0 = r9
            com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$unlockPath$2 r0 = (com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$unlockPath$2) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$unlockPath$2 r0 = new com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$unlockPath$2
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            int r7 = r0.I$0
            java.lang.Object r8 = r0.L$1
            com.habitrpg.android.habitica.models.responses.UnlockResponse r8 = (com.habitrpg.android.habitica.models.responses.UnlockResponse) r8
            java.lang.Object r0 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl r0 = (com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl) r0
            dc.n.b(r9)
            goto L85
        L36:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3e:
            int r8 = r0.I$0
            java.lang.Object r7 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl r7 = (com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl) r7
            dc.n.b(r9)
            goto L5d
        L48:
            dc.n.b(r9)
            com.habitrpg.android.habitica.data.ApiClient r9 = r6.getApiClient()
            r0.L$0 = r6
            r0.I$0 = r8
            r0.label = r4
            java.lang.Object r9 = r9.unlockPath(r7, r0)
            if (r9 != r1) goto L5c
            return r1
        L5c:
            r7 = r6
        L5d:
            com.habitrpg.android.habitica.models.responses.UnlockResponse r9 = (com.habitrpg.android.habitica.models.responses.UnlockResponse) r9
            if (r9 != 0) goto L63
            r7 = 0
            return r7
        L63:
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r2 = r7.getLocalRepository()
            com.habitrpg.android.habitica.data.local.UserLocalRepository r2 = (com.habitrpg.android.habitica.data.local.UserLocalRepository) r2
            java.lang.String r4 = r7.getCurrentUserID()
            dd.g r2 = r2.getUser(r4)
            r0.L$0 = r7
            r0.L$1 = r9
            r0.I$0 = r8
            r0.label = r3
            java.lang.Object r0 = dd.i.x(r2, r0)
            if (r0 != r1) goto L80
            return r1
        L80:
            r5 = r0
            r0 = r7
            r7 = r8
            r8 = r9
            r9 = r5
        L85:
            com.habitrpg.android.habitica.models.user.User r9 = (com.habitrpg.android.habitica.models.user.User) r9
            if (r9 != 0) goto L8a
            return r8
        L8a:
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r0 = r0.getLocalRepository()
            com.habitrpg.android.habitica.data.local.UserLocalRepository r0 = (com.habitrpg.android.habitica.data.local.UserLocalRepository) r0
            com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$unlockPath$3 r1 = new com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$unlockPath$3
            r1.<init>(r8, r7)
            r0.modify(r9, r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl.unlockPath(java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.habitrpg.android.habitica.data.UserRepository
    public g<User> getUser(String str) {
        q.i(str, "userID");
        return getLocalRepository().getUser(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object updateUser(String str, String str2, Object obj, Continuation<? super User> continuation) {
        Map<String, ? extends Object> e10;
        e10 = m0.e(r.a(str2, obj));
        return updateUser(str, e10, continuation);
    }

    @Override // com.habitrpg.android.habitica.data.UserRepository
    public Object updateUser(Map<String, ? extends Object> map, Continuation<? super User> continuation) {
        return updateUser(getCurrentUserID(), map, continuation);
    }

    @Override // com.habitrpg.android.habitica.data.UserRepository
    public Object updateUser(String str, Object obj, Continuation<? super User> continuation) {
        return updateUser(getCurrentUserID(), str, obj, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    @Override // com.habitrpg.android.habitica.data.UserRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object useSkill(java.lang.String r8, java.lang.String r9, kotlin.coroutines.Continuation<? super com.habitrpg.android.habitica.models.responses.SkillResponse> r10) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl.useSkill(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
