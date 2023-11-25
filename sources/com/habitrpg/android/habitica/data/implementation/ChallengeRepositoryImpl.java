package com.habitrpg.android.habitica.data.implementation;

import com.habitrpg.android.habitica.data.ApiClient;
import com.habitrpg.android.habitica.data.ChallengeRepository;
import com.habitrpg.android.habitica.data.local.ChallengeLocalRepository;
import com.habitrpg.android.habitica.models.social.Challenge;
import com.habitrpg.android.habitica.models.social.ChallengeMembership;
import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.android.habitica.modules.AuthenticationHandler;
import com.habitrpg.android.habitica.ui.activities.ChallengeFormActivity;
import com.habitrpg.shared.habitica.models.tasks.TaskType;
import com.habitrpg.shared.habitica.models.tasks.TasksOrder;
import dc.w;
import dd.g;
import ec.u;
import ic.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import qc.q;

/* compiled from: ChallengeRepositoryImpl.kt */
/* loaded from: classes4.dex */
public final class ChallengeRepositoryImpl extends BaseRepositoryImpl<ChallengeLocalRepository> implements ChallengeRepository {
    public static final int $stable = 0;

    /* compiled from: ChallengeRepositoryImpl.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TaskType.values().length];
            try {
                iArr[TaskType.HABIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TaskType.DAILY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TaskType.TODO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TaskType.REWARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeRepositoryImpl(ChallengeLocalRepository challengeLocalRepository, ApiClient apiClient, AuthenticationHandler authenticationHandler) {
        super(challengeLocalRepository, apiClient, authenticationHandler);
        q.i(challengeLocalRepository, "localRepository");
        q.i(apiClient, "apiClient");
        q.i(authenticationHandler, "authenticationHandler");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object addChallengeTasks(Challenge challenge, List<? extends Task> list, Continuation<? super w> continuation) {
        Object d10;
        Object d11;
        List<? extends Task> list2 = list;
        String str = "";
        if (list2.size() == 1) {
            ApiClient apiClient = getApiClient();
            String id2 = challenge.getId();
            if (id2 != null) {
                str = id2;
            }
            Object createChallengeTask = apiClient.createChallengeTask(str, list.get(0), continuation);
            d11 = d.d();
            if (createChallengeTask == d11) {
                return createChallengeTask;
            }
            return w.f13270a;
        } else if (list2.size() > 1) {
            ApiClient apiClient2 = getApiClient();
            String id3 = challenge.getId();
            if (id3 != null) {
                str = id3;
            }
            Object createChallengeTasks = apiClient2.createChallengeTasks(str, list, continuation);
            d10 = d.d();
            if (createChallengeTasks == d10) {
                return createChallengeTasks;
            }
            return w.f13270a;
        } else {
            return w.f13270a;
        }
    }

    private final TasksOrder getTaskOrders(List<? extends Task> list) {
        int s10;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            TaskType type = ((Task) obj).getType();
            Object obj2 = linkedHashMap.get(type);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(type, obj2);
            }
            ((List) obj2).add(obj);
        }
        TasksOrder tasksOrder = new TasksOrder();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            TaskType taskType = (TaskType) entry.getKey();
            List list2 = (List) entry.getValue();
            s10 = u.s(list2, 10);
            ArrayList arrayList = new ArrayList(s10);
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                String id2 = ((Task) it.next()).getId();
                if (id2 == null) {
                    id2 = "";
                }
                arrayList.add(id2);
            }
            if (taskType != null) {
                int i10 = WhenMappings.$EnumSwitchMapping$0[taskType.ordinal()];
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 == 4) {
                                tasksOrder.setRewards(arrayList);
                            }
                        } else {
                            tasksOrder.setTodos(arrayList);
                        }
                    } else {
                        tasksOrder.setDailys(arrayList);
                    }
                } else {
                    tasksOrder.setHabits(arrayList);
                }
            }
        }
        return tasksOrder;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // com.habitrpg.android.habitica.data.ChallengeRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object createChallenge(com.habitrpg.android.habitica.models.social.Challenge r6, java.util.List<? extends com.habitrpg.android.habitica.models.tasks.Task> r7, kotlin.coroutines.Continuation<? super com.habitrpg.android.habitica.models.social.Challenge> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.habitrpg.android.habitica.data.implementation.ChallengeRepositoryImpl$createChallenge$1
            if (r0 == 0) goto L13
            r0 = r8
            com.habitrpg.android.habitica.data.implementation.ChallengeRepositoryImpl$createChallenge$1 r0 = (com.habitrpg.android.habitica.data.implementation.ChallengeRepositoryImpl$createChallenge$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.ChallengeRepositoryImpl$createChallenge$1 r0 = new com.habitrpg.android.habitica.data.implementation.ChallengeRepositoryImpl$createChallenge$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.L$0
            com.habitrpg.android.habitica.models.social.Challenge r6 = (com.habitrpg.android.habitica.models.social.Challenge) r6
            dc.n.b(r8)
            goto L74
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            java.lang.Object r6 = r0.L$1
            r7 = r6
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r6 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.ChallengeRepositoryImpl r6 = (com.habitrpg.android.habitica.data.implementation.ChallengeRepositoryImpl) r6
            dc.n.b(r8)
            goto L61
        L45:
            dc.n.b(r8)
            com.habitrpg.shared.habitica.models.tasks.TasksOrder r8 = r5.getTaskOrders(r7)
            r6.setTasksOrder(r8)
            com.habitrpg.android.habitica.data.ApiClient r8 = r5.getApiClient()
            r0.L$0 = r5
            r0.L$1 = r7
            r0.label = r4
            java.lang.Object r8 = r8.createChallenge(r6, r0)
            if (r8 != r1) goto L60
            return r1
        L60:
            r6 = r5
        L61:
            com.habitrpg.android.habitica.models.social.Challenge r8 = (com.habitrpg.android.habitica.models.social.Challenge) r8
            if (r8 == 0) goto L75
            r0.L$0 = r8
            r2 = 0
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r6 = r6.addChallengeTasks(r8, r7, r0)
            if (r6 != r1) goto L73
            return r1
        L73:
            r6 = r8
        L74:
            r8 = r6
        L75:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.ChallengeRepositoryImpl.createChallenge(com.habitrpg.android.habitica.models.social.Challenge, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.habitrpg.android.habitica.data.ChallengeRepository
    public Object deleteChallenge(String str, Continuation<? super Void> continuation) {
        return getApiClient().deleteChallenge(str, continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ChallengeRepository
    public g<Challenge> getChallenge(String str) {
        q.i(str, ChallengeFormActivity.CHALLENGE_ID_KEY);
        return getLocalRepository().getChallenge(str);
    }

    @Override // com.habitrpg.android.habitica.data.ChallengeRepository
    public g<List<ChallengeMembership>> getChallengeMemberships() {
        return getLocalRepository().getChallengeMemberships(getCurrentUserID());
    }

    @Override // com.habitrpg.android.habitica.data.ChallengeRepository
    public g<List<Task>> getChallengeTasks(String str) {
        q.i(str, ChallengeFormActivity.CHALLENGE_ID_KEY);
        return getLocalRepository().getTasks(str);
    }

    @Override // com.habitrpg.android.habitica.data.ChallengeRepository
    public g<ChallengeMembership> getChallengepMembership(String str) {
        q.i(str, "id");
        return getLocalRepository().getChallengeMembership(getCurrentUserID(), str);
    }

    @Override // com.habitrpg.android.habitica.data.ChallengeRepository
    public g<List<Challenge>> getChallenges() {
        return getLocalRepository().getChallenges();
    }

    @Override // com.habitrpg.android.habitica.data.ChallengeRepository
    public g<List<Challenge>> getUserChallenges(String str) {
        ChallengeLocalRepository localRepository = getLocalRepository();
        if (str == null) {
            str = getCurrentUserID();
        }
        return localRepository.getUserChallenges(str);
    }

    @Override // com.habitrpg.android.habitica.data.ChallengeRepository
    public g<Boolean> isChallengeMember(String str) {
        q.i(str, "challengeID");
        return getLocalRepository().isChallengeMember(getCurrentUserID(), str);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0057  */
    @Override // com.habitrpg.android.habitica.data.ChallengeRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object joinChallenge(com.habitrpg.android.habitica.models.social.Challenge r6, kotlin.coroutines.Continuation<? super com.habitrpg.android.habitica.models.social.Challenge> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.habitrpg.android.habitica.data.implementation.ChallengeRepositoryImpl$joinChallenge$1
            if (r0 == 0) goto L13
            r0 = r7
            com.habitrpg.android.habitica.data.implementation.ChallengeRepositoryImpl$joinChallenge$1 r0 = (com.habitrpg.android.habitica.data.implementation.ChallengeRepositoryImpl$joinChallenge$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.ChallengeRepositoryImpl$joinChallenge$1 r0 = new com.habitrpg.android.habitica.data.implementation.ChallengeRepositoryImpl$joinChallenge$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            java.lang.String r3 = ""
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r6 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.ChallengeRepositoryImpl r6 = (com.habitrpg.android.habitica.data.implementation.ChallengeRepositoryImpl) r6
            dc.n.b(r7)
            goto L51
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            dc.n.b(r7)
            com.habitrpg.android.habitica.data.ApiClient r7 = r5.getApiClient()
            java.lang.String r6 = r6.getId()
            if (r6 != 0) goto L45
            r6 = r3
        L45:
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r7 = r7.joinChallenge(r6, r0)
            if (r7 != r1) goto L50
            return r1
        L50:
            r6 = r5
        L51:
            com.habitrpg.android.habitica.models.social.Challenge r7 = (com.habitrpg.android.habitica.models.social.Challenge) r7
            if (r7 != 0) goto L57
            r6 = 0
            return r6
        L57:
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r0 = r6.getLocalRepository()
            com.habitrpg.android.habitica.data.local.ChallengeLocalRepository r0 = (com.habitrpg.android.habitica.data.local.ChallengeLocalRepository) r0
            java.lang.String r6 = r6.getCurrentUserID()
            java.lang.String r1 = r7.getId()
            if (r1 != 0) goto L68
            goto L69
        L68:
            r3 = r1
        L69:
            r0.setParticipating(r6, r3, r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.ChallengeRepositoryImpl.joinChallenge(com.habitrpg.android.habitica.models.social.Challenge, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    @Override // com.habitrpg.android.habitica.data.ChallengeRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object leaveChallenge(com.habitrpg.android.habitica.models.social.Challenge r7, java.lang.String r8, kotlin.coroutines.Continuation<? super java.lang.Void> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.habitrpg.android.habitica.data.implementation.ChallengeRepositoryImpl$leaveChallenge$1
            if (r0 == 0) goto L13
            r0 = r9
            com.habitrpg.android.habitica.data.implementation.ChallengeRepositoryImpl$leaveChallenge$1 r0 = (com.habitrpg.android.habitica.data.implementation.ChallengeRepositoryImpl$leaveChallenge$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.ChallengeRepositoryImpl$leaveChallenge$1 r0 = new com.habitrpg.android.habitica.data.implementation.ChallengeRepositoryImpl$leaveChallenge$1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            java.lang.String r3 = ""
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 != r4) goto L33
            java.lang.Object r7 = r0.L$1
            com.habitrpg.android.habitica.models.social.Challenge r7 = (com.habitrpg.android.habitica.models.social.Challenge) r7
            java.lang.Object r8 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.ChallengeRepositoryImpl r8 = (com.habitrpg.android.habitica.data.implementation.ChallengeRepositoryImpl) r8
            dc.n.b(r9)
            goto L5c
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3b:
            dc.n.b(r9)
            com.habitrpg.android.habitica.data.ApiClient r9 = r6.getApiClient()
            java.lang.String r2 = r7.getId()
            if (r2 != 0) goto L49
            r2 = r3
        L49:
            com.habitrpg.android.habitica.models.LeaveChallengeBody r5 = new com.habitrpg.android.habitica.models.LeaveChallengeBody
            r5.<init>(r8)
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r4
            java.lang.Object r8 = r9.leaveChallenge(r2, r5, r0)
            if (r8 != r1) goto L5b
            return r1
        L5b:
            r8 = r6
        L5c:
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r9 = r8.getLocalRepository()
            com.habitrpg.android.habitica.data.local.ChallengeLocalRepository r9 = (com.habitrpg.android.habitica.data.local.ChallengeLocalRepository) r9
            java.lang.String r8 = r8.getCurrentUserID()
            java.lang.String r7 = r7.getId()
            if (r7 != 0) goto L6d
            goto L6e
        L6d:
            r3 = r7
        L6e:
            r7 = 0
            r9.setParticipating(r8, r3, r7)
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.ChallengeRepositoryImpl.leaveChallenge(com.habitrpg.android.habitica.models.social.Challenge, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    @Override // com.habitrpg.android.habitica.data.ChallengeRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object retrieveChallenge(java.lang.String r5, kotlin.coroutines.Continuation<? super com.habitrpg.android.habitica.models.social.Challenge> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.habitrpg.android.habitica.data.implementation.ChallengeRepositoryImpl$retrieveChallenge$1
            if (r0 == 0) goto L13
            r0 = r6
            com.habitrpg.android.habitica.data.implementation.ChallengeRepositoryImpl$retrieveChallenge$1 r0 = (com.habitrpg.android.habitica.data.implementation.ChallengeRepositoryImpl$retrieveChallenge$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.ChallengeRepositoryImpl$retrieveChallenge$1 r0 = new com.habitrpg.android.habitica.data.implementation.ChallengeRepositoryImpl$retrieveChallenge$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.ChallengeRepositoryImpl r5 = (com.habitrpg.android.habitica.data.implementation.ChallengeRepositoryImpl) r5
            dc.n.b(r6)
            goto L48
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            dc.n.b(r6)
            com.habitrpg.android.habitica.data.ApiClient r6 = r4.getApiClient()
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r6.getChallenge(r5, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            r5 = r4
        L48:
            com.habitrpg.android.habitica.models.social.Challenge r6 = (com.habitrpg.android.habitica.models.social.Challenge) r6
            if (r6 != 0) goto L4e
            r5 = 0
            return r5
        L4e:
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r5 = r5.getLocalRepository()
            com.habitrpg.android.habitica.data.local.ChallengeLocalRepository r5 = (com.habitrpg.android.habitica.data.local.ChallengeLocalRepository) r5
            r5.save(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.ChallengeRepositoryImpl.retrieveChallenge(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    @Override // com.habitrpg.android.habitica.data.ChallengeRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object retrieveChallengeTasks(java.lang.String r5, kotlin.coroutines.Continuation<? super com.habitrpg.android.habitica.models.tasks.TaskList> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.habitrpg.android.habitica.data.implementation.ChallengeRepositoryImpl$retrieveChallengeTasks$1
            if (r0 == 0) goto L13
            r0 = r6
            com.habitrpg.android.habitica.data.implementation.ChallengeRepositoryImpl$retrieveChallengeTasks$1 r0 = (com.habitrpg.android.habitica.data.implementation.ChallengeRepositoryImpl$retrieveChallengeTasks$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.ChallengeRepositoryImpl$retrieveChallengeTasks$1 r0 = new com.habitrpg.android.habitica.data.implementation.ChallengeRepositoryImpl$retrieveChallengeTasks$1
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
            com.habitrpg.android.habitica.data.implementation.ChallengeRepositoryImpl r0 = (com.habitrpg.android.habitica.data.implementation.ChallengeRepositoryImpl) r0
            dc.n.b(r6)
            goto L4e
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            dc.n.b(r6)
            com.habitrpg.android.habitica.data.ApiClient r6 = r4.getApiClient()
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r6 = r6.getChallengeTasks(r5, r0)
            if (r6 != r1) goto L4d
            return r1
        L4d:
            r0 = r4
        L4e:
            com.habitrpg.android.habitica.models.tasks.TaskList r6 = (com.habitrpg.android.habitica.models.tasks.TaskList) r6
            if (r6 == 0) goto L80
            java.util.Map r1 = r6.getTasks()
            java.util.Collection r1 = r1.values()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r1 = ec.r.C0(r1)
            r2 = r1
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L67:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L77
            java.lang.Object r3 = r2.next()
            com.habitrpg.android.habitica.models.tasks.Task r3 = (com.habitrpg.android.habitica.models.tasks.Task) r3
            r3.setOwnerID(r5)
            goto L67
        L77:
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r5 = r0.getLocalRepository()
            com.habitrpg.android.habitica.data.local.ChallengeLocalRepository r5 = (com.habitrpg.android.habitica.data.local.ChallengeLocalRepository) r5
            r5.save(r1)
        L80:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.ChallengeRepositoryImpl.retrieveChallengeTasks(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    @Override // com.habitrpg.android.habitica.data.ChallengeRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object retrieveChallenges(int r5, boolean r6, kotlin.coroutines.Continuation<? super java.util.List<? extends com.habitrpg.android.habitica.models.social.Challenge>> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.habitrpg.android.habitica.data.implementation.ChallengeRepositoryImpl$retrieveChallenges$1
            if (r0 == 0) goto L13
            r0 = r7
            com.habitrpg.android.habitica.data.implementation.ChallengeRepositoryImpl$retrieveChallenges$1 r0 = (com.habitrpg.android.habitica.data.implementation.ChallengeRepositoryImpl$retrieveChallenges$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.ChallengeRepositoryImpl$retrieveChallenges$1 r0 = new com.habitrpg.android.habitica.data.implementation.ChallengeRepositoryImpl$retrieveChallenges$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            boolean r6 = r0.Z$0
            int r5 = r0.I$0
            java.lang.Object r0 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.ChallengeRepositoryImpl r0 = (com.habitrpg.android.habitica.data.implementation.ChallengeRepositoryImpl) r0
            dc.n.b(r7)
            goto L50
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            dc.n.b(r7)
            com.habitrpg.android.habitica.data.ApiClient r7 = r4.getApiClient()
            r0.L$0 = r4
            r0.I$0 = r5
            r0.Z$0 = r6
            r0.label = r3
            java.lang.Object r7 = r7.getUserChallenges(r5, r6, r0)
            if (r7 != r1) goto L4f
            return r1
        L4f:
            r0 = r4
        L50:
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L65
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r1 = r0.getLocalRepository()
            com.habitrpg.android.habitica.data.local.ChallengeLocalRepository r1 = (com.habitrpg.android.habitica.data.local.ChallengeLocalRepository) r1
            if (r5 != 0) goto L5d
            goto L5e
        L5d:
            r3 = 0
        L5e:
            java.lang.String r5 = r0.getCurrentUserID()
            r1.saveChallenges(r7, r3, r6, r5)
        L65:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.ChallengeRepositoryImpl.retrieveChallenges(int, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x018b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0190  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x010b -> B:33:0x010e). Please submit an issue!!! */
    @Override // com.habitrpg.android.habitica.data.ChallengeRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object updateChallenge(com.habitrpg.android.habitica.models.social.Challenge r20, java.util.List<? extends com.habitrpg.android.habitica.models.tasks.Task> r21, java.util.List<? extends com.habitrpg.android.habitica.models.tasks.Task> r22, java.util.List<? extends com.habitrpg.android.habitica.models.tasks.Task> r23, java.util.List<java.lang.String> r24, kotlin.coroutines.Continuation<? super com.habitrpg.android.habitica.models.social.Challenge> r25) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.ChallengeRepositoryImpl.updateChallenge(com.habitrpg.android.habitica.models.social.Challenge, java.util.List, java.util.List, java.util.List, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
