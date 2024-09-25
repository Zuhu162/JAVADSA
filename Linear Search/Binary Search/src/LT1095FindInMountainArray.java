/** https://leetcode.com/problems/find-in-mountain-array/
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

//class Solution {
//    public int findInMountainArray(int target, MountainArray mountainArr) {
//        int peak = findPeakIndex(mountainArr);
//
//        int lowerSearch = findTarget(mountainArr, target, 0, peak, true);
//        int upperSearch = findTarget(mountainArr, target, peak, mountainArr.length() - 1, false);
//
//        if(lowerSearch != -1){
//            return lowerSearch;
//        }
//        else if(upperSearch != -1){
//            return upperSearch;
//        }
//        else return -1;
//    }
//
//    int findTarget(MountainArray mountainArr, int target, int start, int end, boolean isAsc){
//        while(start <= end){
//            int mid = start + (end - start) / 2;
//
//
//            if(target > mountainArr.get(mid)){
//                if(isAsc){
//                    start = mid + 1;
//                }
//                else{
//                    end = mid - 1;
//                }
//            }
//            else if(target < mountainArr.get(mid)){
//                if(isAsc){
//                    end = mid - 1;
//                }
//                else {
//                    start = mid + 1;
//                }
//
//            }
//            else return mid;
//        }
//        return -1;
//    }
//
//    int findPeakIndex(MountainArray mountainArr){
//        int start = 0;
//        int end = mountainArr.length() - 1;
//        int peak = -1;
//
//        while(start <= end){
//            int mid = start + (end - start) / 2;
//
//            int midArray = mountainArr.get(mid);
//
//            if(mountainArr.get(mid + 1) > midArray){
//                start = mid + 1;
//            }
//            else if(mountainArr.get(mid - 1) > midArray){
//                end = mid - 1;
//            }
//            else return mid;
//        }
//
//        return peak;
//    }
//}