using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.AI;


public class MeshTest : MonoBehaviour {

	  public Transform target;
    Vector3 destination;
    NavMeshAgent agent;
	// Use this for initialization
	void Start () {
		
		agent = GetComponent<NavMeshAgent>();
        destination = agent.destination;

	}
	
	// Update is called once per frame
	void Update () {
		destination = target.position;
            agent.destination = destination;
	}
}
