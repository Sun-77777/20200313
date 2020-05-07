public class Main {
    public static void main(String[] args) {
        int gen = 0;
        int maxCycle = 20;
        Population p = new Population();
        p.Initialize();// 初始化
        while (gen <= maxCycle) {
            p.Mutation();
            p.CrossOver();
            p.Selection();
            gen++;
            p.SaveBest();
        }
    }
}


/**
 * 从一个随机产生的初始种群开始，通过把种群中任意两个个体的向量差与第三个个体求和来产生新个体，
 * 然后将新个体与当代种群中相应的个体相比较，如果新个体的适应度优于当前个体的适应度，
 * 则在下一代中就用新个体取代旧个体，否则仍保存旧个体。
 * 通过不断地进化，保留优良个体，淘汰劣质个体，引导搜索向最优解逼近。
 * @param args
 */

/**
 * (2)随机产生初始种群。
 * (3)对初始种群进行评价，即计算初始种群中每个个体的适应度值。
 * (4)判断是否达到终止条件或进化代数达到最大。若是，则终止进化，将得到最佳个体作为最优解输出；若否，继续。
 * (5)进行变异和交叉操作，得到中间种群。
 * (6)在原种群和中间种群中选择个体，得到新一代种群。
 * (7)进化代数g=g+1，转步骤(4).
 * @param args
 */
