package com.habitrpg.android.habitica.interactors;

import com.habitrpg.android.habitica.models.tasks.ChecklistItem;
import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.android.habitica.models.user.Buffs;
import com.habitrpg.android.habitica.models.user.Gear;
import com.habitrpg.android.habitica.models.user.Items;
import com.habitrpg.android.habitica.models.user.Outfit;
import com.habitrpg.android.habitica.models.user.Stats;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.shared.habitica.models.responses.TaskDirection;
import com.habitrpg.shared.habitica.models.responses.TaskDirectionData;
import com.habitrpg.shared.habitica.models.tasks.TaskType;
import ec.u;
import io.realm.x0;
import java.util.ArrayList;
import java.util.Iterator;
import qc.h;
import qc.q;
import sc.c;

/* compiled from: ScoreTaskLocallyInteractor.kt */
/* loaded from: classes4.dex */
public final class ScoreTaskLocallyInteractor {
    public static final int $stable = 0;
    public static final double CLOSE_ENOUGH = 1.0E-5d;
    public static final Companion Companion = new Companion(null);
    public static final double MAX_TASK_VALUE = 21.27d;
    public static final double MIN_TASK_VALUE = -47.27d;

    /* compiled from: ScoreTaskLocallyInteractor.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {

        /* compiled from: ScoreTaskLocallyInteractor.kt */
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

        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        private final void addPoints(TaskDirectionData taskDirectionData, double d10, Stats stats, Stats stats2, Task task, TaskDirection taskDirection) {
            float f10;
            double d11;
            long e10;
            int i10;
            Integer intelligence = stats2.getIntelligence();
            float f11 = 0.0f;
            if (intelligence != null) {
                f10 = intelligence.intValue();
            } else {
                f10 = 0.0f;
            }
            float f12 = (f10 * 0.025f) + 1.0f;
            Double exp = stats.getExp();
            double d12 = 0.0d;
            if (exp != null) {
                d11 = exp.doubleValue();
            } else {
                d11 = 0.0d;
            }
            e10 = c.e(f12 * d10 * task.getPriority() * 6);
            taskDirectionData.setExp(d11 + e10);
            Integer per = stats2.getPer();
            if (per != null) {
                f11 = per.intValue();
            }
            double priority = task.getPriority() * d10 * ((f11 * 0.02f) + 1.0f);
            Integer streak = task.getStreak();
            if (streak != null) {
                i10 = streak.intValue();
            } else {
                i10 = 0;
            }
            Double gp = stats.getGp();
            if (gp != null) {
                d12 = gp.doubleValue();
            }
            if (task.getStreak() != null) {
                if (taskDirection == TaskDirection.DOWN) {
                    i10--;
                }
                priority *= (i10 / 100) * 1;
            }
            taskDirectionData.setGp(d12 + priority);
        }

        private final double calculateDelta(Task task, TaskDirection taskDirection) {
            int i10;
            int i11;
            int s10;
            double d10 = -47.27d;
            if (task.getValue() >= -47.27d) {
                d10 = 21.27d;
                if (task.getValue() <= 21.27d) {
                    d10 = task.getValue();
                }
            }
            double pow = Math.pow(0.9747d, d10);
            if (taskDirection == TaskDirection.DOWN) {
                i10 = -1;
            } else {
                i10 = 1;
            }
            double d11 = pow * i10;
            x0<ChecklistItem> checklist = task.getChecklist();
            int i12 = 0;
            if (checklist != null) {
                i11 = checklist.size();
            } else {
                i11 = 0;
            }
            if (i11 > 0 && task.getType() == TaskType.TODO) {
                x0<ChecklistItem> checklist2 = task.getChecklist();
                if (checklist2 != null) {
                    s10 = u.s(checklist2, 10);
                    ArrayList arrayList = new ArrayList(s10);
                    Iterator<ChecklistItem> it = checklist2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(it.next().getCompleted() ? 1 : 0));
                    }
                    Iterator it2 = arrayList.iterator();
                    if (it2.hasNext()) {
                        Integer num = it2.next();
                        while (it2.hasNext()) {
                            ((Number) it2.next()).intValue();
                            ((Number) num).intValue();
                            num = 0;
                        }
                        i12 = ((Number) num).intValue();
                    } else {
                        throw new UnsupportedOperationException("Empty collection can't be reduced.");
                    }
                }
                return d11 * (1 + i12);
            }
            return d11;
        }

        private final Stats computeStats(User user) {
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            Outfit outfit;
            Gear gear;
            Integer per;
            Integer constitution;
            Integer intelligence;
            Integer strength;
            Buffs buffs;
            Float per2;
            Buffs buffs2;
            Float con;
            Buffs buffs3;
            Float f10;
            Buffs buffs4;
            Float str;
            Integer lvl;
            Stats stats = user.getStats();
            int i18 = 0;
            if (stats != null && (lvl = stats.getLvl()) != null) {
                i10 = lvl.intValue();
            } else {
                i10 = 0;
            }
            int min = (int) Math.min(i10 / 2.0f, 50.0f);
            Stats stats2 = user.getStats();
            if (stats2 != null && (buffs4 = stats2.getBuffs()) != null && (str = buffs4.getStr()) != null) {
                i11 = (int) str.floatValue();
            } else {
                i11 = 0;
            }
            int i19 = i11 + min;
            Stats stats3 = user.getStats();
            if (stats3 != null && (buffs3 = stats3.getBuffs()) != null && (f10 = buffs3.get_int()) != null) {
                i12 = (int) f10.floatValue();
            } else {
                i12 = 0;
            }
            int i20 = i12 + min;
            Stats stats4 = user.getStats();
            if (stats4 != null && (buffs2 = stats4.getBuffs()) != null && (con = buffs2.getCon()) != null) {
                i13 = (int) con.floatValue();
            } else {
                i13 = 0;
            }
            int i21 = i13 + min;
            Stats stats5 = user.getStats();
            if (stats5 != null && (buffs = stats5.getBuffs()) != null && (per2 = buffs.getPer()) != null) {
                i14 = (int) per2.floatValue();
            } else {
                i14 = 0;
            }
            int i22 = min + i14;
            Stats stats6 = user.getStats();
            if (stats6 != null && (strength = stats6.getStrength()) != null) {
                i15 = strength.intValue();
            } else {
                i15 = 0;
            }
            int i23 = i19 + i15;
            Stats stats7 = user.getStats();
            if (stats7 != null && (intelligence = stats7.getIntelligence()) != null) {
                i16 = intelligence.intValue();
            } else {
                i16 = 0;
            }
            int i24 = i20 + i16;
            Stats stats8 = user.getStats();
            if (stats8 != null && (constitution = stats8.getConstitution()) != null) {
                i17 = constitution.intValue();
            } else {
                i17 = 0;
            }
            int i25 = i21 + i17;
            Stats stats9 = user.getStats();
            if (stats9 != null && (per = stats9.getPer()) != null) {
                i18 = per.intValue();
            }
            int i26 = i22 + i18;
            Items items = user.getItems();
            if (items != null && (gear = items.getGear()) != null) {
                outfit = gear.getEquipped();
            } else {
                outfit = null;
            }
            ArrayList arrayList = new ArrayList();
            if (outfit != null) {
                arrayList.add(outfit.getArmor());
                arrayList.add(outfit.getBack());
                arrayList.add(outfit.getBody());
                arrayList.add(outfit.getEyeWear());
                arrayList.add(outfit.getHead());
                arrayList.add(outfit.getHeadAccessory());
                arrayList.add(outfit.getShield());
                arrayList.add(outfit.getWeapon());
            }
            Stats stats10 = new Stats();
            stats10.setStrength(Integer.valueOf(i23));
            stats10.setIntelligence(Integer.valueOf(i24));
            stats10.setConstitution(Integer.valueOf(i25));
            stats10.setPer(Integer.valueOf(i26));
            return stats10;
        }

        private final void subtractPoints(TaskDirectionData taskDirectionData, double d10, Stats stats, Stats stats2, Task task) {
            float f10;
            double d11;
            long e10;
            Integer constitution = stats2.getConstitution();
            if (constitution != null) {
                f10 = constitution.intValue();
            } else {
                f10 = 0.0f;
            }
            float f11 = 1.0f - (f10 / 250.0f);
            if (f11 < 0.1d) {
                f11 = 0.1f;
            }
            double priority = d10 * f11 * task.getPriority() * 2;
            Double hp = stats.getHp();
            if (hp != null) {
                d11 = hp.doubleValue();
            } else {
                d11 = 0.0d;
            }
            e10 = c.e(priority * 10);
            taskDirectionData.setHp(d11 + (e10 / 10.0d));
        }

        public final TaskDirectionData score(User user, Task task, TaskDirection taskDirection) {
            Stats stats;
            double d10;
            double d11;
            double d12;
            double d13;
            int i10;
            double d14;
            Integer lvl;
            Integer lvl2;
            q.i(user, "user");
            q.i(task, "task");
            q.i(taskDirection, "direction");
            if ((task.getType() != TaskType.HABIT && taskDirection != TaskDirection.UP) || (stats = user.getStats()) == null) {
                return null;
            }
            Stats computeStats = computeStats(user);
            TaskDirectionData taskDirectionData = new TaskDirectionData();
            Double hp = stats.getHp();
            double d15 = 0.0d;
            if (hp != null) {
                d10 = hp.doubleValue();
            } else {
                d10 = 0.0d;
            }
            taskDirectionData.setHp(d10);
            Double exp = stats.getExp();
            if (exp != null) {
                d11 = exp.doubleValue();
            } else {
                d11 = 0.0d;
            }
            taskDirectionData.setExp(d11);
            Double gp = stats.getGp();
            if (gp != null) {
                d12 = gp.doubleValue();
            } else {
                d12 = 0.0d;
            }
            taskDirectionData.setGp(d12);
            Double mp = stats.getMp();
            if (mp != null) {
                d13 = mp.doubleValue();
            } else {
                d13 = 0.0d;
            }
            taskDirectionData.setMp(d13);
            double calculateDelta = calculateDelta(task, taskDirection);
            taskDirectionData.setDelta((float) calculateDelta);
            if (calculateDelta > 0.0d) {
                addPoints(taskDirectionData, calculateDelta, stats, computeStats, task, taskDirection);
            } else {
                subtractPoints(taskDirectionData, calculateDelta, stats, computeStats, task);
            }
            TaskType type = task.getType();
            if (type == null) {
                i10 = -1;
            } else {
                i10 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            scoreReward(user, task, taskDirection);
                        }
                    } else {
                        scoreToDo(user, task, taskDirection);
                    }
                } else {
                    scoreDaily(user, task, taskDirection);
                }
            } else {
                scoreHabit(user, task, taskDirection);
            }
            if (taskDirectionData.getHp() <= 0.0d) {
                taskDirectionData.setHp(0.0d);
            }
            double exp2 = taskDirectionData.getExp();
            Integer toNextLevel = stats.getToNextLevel();
            if (toNextLevel != null) {
                d14 = toNextLevel.intValue();
            } else {
                d14 = 0.0d;
            }
            int i11 = 0;
            if (exp2 >= d14) {
                double exp3 = taskDirectionData.getExp();
                Integer toNextLevel2 = stats.getToNextLevel();
                if (toNextLevel2 != null) {
                    d15 = toNextLevel2.intValue();
                }
                taskDirectionData.setExp(exp3 - d15);
                Stats stats2 = user.getStats();
                if (stats2 != null && (lvl2 = stats2.getLvl()) != null) {
                    i11 = lvl2.intValue();
                }
                taskDirectionData.setLvl(i11 + 1);
                taskDirectionData.setHp(50.0d);
            } else {
                Stats stats3 = user.getStats();
                if (stats3 != null && (lvl = stats3.getLvl()) != null) {
                    i11 = lvl.intValue();
                }
                taskDirectionData.setLvl(i11);
            }
            return taskDirectionData;
        }

        private final void scoreDaily(User user, Task task, TaskDirection taskDirection) {
        }

        private final void scoreHabit(User user, Task task, TaskDirection taskDirection) {
        }

        private final void scoreReward(User user, Task task, TaskDirection taskDirection) {
        }

        private final void scoreToDo(User user, Task task, TaskDirection taskDirection) {
        }
    }
}
